import sqlite3
import os


class UserDatabaseManager:

    def __init__(self, db_path):
        self.connection = sqlite3.connect(db_path)
        self.cursor = self.connection.cursor()

        self.cursor.execute("""
            CREATE TABLE IF NOT EXISTS users (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                username TEXT UNIQUE NOT NULL,
                address TEXT,
                mobile TEXT,
                email TEXT
            )
        """)

        self.connection.commit()

    def find_user(self, username):
        self.cursor.execute(
            "SELECT id, username, address, mobile, email FROM users WHERE username = ?",
            (username,)
        )

        row = self.cursor.fetchone()

        if row is None:
            return None

        return {
            "id": row[0],
            "username": row[1],
            "address": row[2],
            "mobile": row[3],
            "email": row[4]
        }

    def add_or_update_user(self, username, address, mobile, email):
        existing_user = self.find_user(username)

        if existing_user:
            self.cursor.execute(
                """
                UPDATE users
                SET address = ?, mobile = ?, email = ?
                WHERE username = ?
                """,
                (address, mobile, email, username)
            )

            self.connection.commit()
            return "UPDATED"

        self.cursor.execute(
            """
            INSERT INTO users (username, address, mobile, email)
            VALUES (?, ?, ?, ?)
            """,
            (username, address, mobile, email)
        )

        self.connection.commit()
        return "INSERTED"

    def list_all_users(self):
        self.cursor.execute(
            """
            SELECT id, username, address, mobile, email
            FROM users
            ORDER BY username ASC
            """
        )

        rows = self.cursor.fetchall()

        users = []

        for row in rows:
            users.append({
                "id": row[0],
                "username": row[1],
                "address": row[2],
                "mobile": row[3],
                "email": row[4]
            })

        return users

    def close(self):
        self.connection.close()


folder = os.path.dirname(os.path.abspath(__file__))
db_path = os.path.join(folder, "company.db")

db = UserDatabaseManager(db_path)

status1 = db.add_or_update_user(
    "arham_k",
    "Pune, MH",
    "9876543210",
    "arham@cdac.in"
)

print(status1)

user_info = db.find_user("arham_k")
print(user_info)

print(user_info["email"])

status2 = db.add_or_update_user(
    "arham_k",
    "Bengaluru, KA",
    "9876543210",
    "arham@cdac.in"
)

print(status2)

print(db.find_user("arham_k"))

print(db.list_all_users())

db.close()
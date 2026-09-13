import sqlite3
import os
from datetime import datetime


class TransactionError(Exception):
    pass


class BankingLedger:

    def __init__(self, db_path):
        self.connection = sqlite3.connect(db_path)
        self.cursor = self.connection.cursor()

        self.cursor.execute("""
            CREATE TABLE IF NOT EXISTS accounts (
                account_id TEXT PRIMARY KEY,
                holder_name TEXT,
                balance REAL
            )
        """)

        self.cursor.execute("""
            CREATE TABLE IF NOT EXISTS audit_log (
                tx_id INTEGER PRIMARY KEY AUTOINCREMENT,
                from_acc TEXT,
                to_acc TEXT,
                amount REAL,
                timestamp TEXT
            )
        """)

        self.connection.commit()

    def create_account(self, account_id, holder_name, initial_deposit):
        if initial_deposit < 0:
            raise ValueError("Initial deposit cannot be negative")

        self.cursor.execute(
            """
            INSERT INTO accounts (account_id, holder_name, balance)
            VALUES (?, ?, ?)
            """,
            (account_id, holder_name, initial_deposit)
        )

        self.connection.commit()

    def transfer_funds(self, from_acc, to_acc, amount):
        try:
            if amount <= 0:
                raise TransactionError("Transfer amount must be greater than zero")

            self.cursor.execute(
                "SELECT balance FROM accounts WHERE account_id = ?",
                (from_acc,)
            )

            sender = self.cursor.fetchone()

            if sender is None:
                raise TransactionError(f"Account {from_acc} does not exist")

            self.cursor.execute(
                "SELECT balance FROM accounts WHERE account_id = ?",
                (to_acc,)
            )

            receiver = self.cursor.fetchone()

            if receiver is None:
                raise TransactionError(f"Account {to_acc} does not exist")

            if sender[0] < amount:
                raise TransactionError(f"Insufficient funds in account {from_acc}")

            self.cursor.execute(
                """
                UPDATE accounts
                SET balance = balance - ?
                WHERE account_id = ?
                """,
                (amount, from_acc)
            )

            self.cursor.execute(
                """
                UPDATE accounts
                SET balance = balance + ?
                WHERE account_id = ?
                """,
                (amount, to_acc)
            )

            timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")

            self.cursor.execute(
                """
                INSERT INTO audit_log
                (from_acc, to_acc, amount, timestamp)
                VALUES (?, ?, ?, ?)
                """,
                (from_acc, to_acc, amount, timestamp)
            )

            self.connection.commit()

        except TransactionError:
            self.connection.rollback()
            raise

        except Exception:
            self.connection.rollback()
            raise

    def get_balance(self, account_id):
        self.cursor.execute(
            "SELECT balance FROM accounts WHERE account_id = ?",
            (account_id,)
        )

        row = self.cursor.fetchone()

        if row is None:
            raise TransactionError(f"Account {account_id} does not exist")

        return row[0]

    def close(self):
        self.connection.close()


folder = os.path.dirname(os.path.abspath(__file__))
db_path = os.path.join(folder, "bank.db")

bank = BankingLedger(db_path)

try:
    bank.create_account("ACC101", "Arham", 5000.0)
except sqlite3.IntegrityError:
    pass

try:
    bank.create_account("ACC102", "Lisa", 2000.0)
except sqlite3.IntegrityError:
    pass

print("ACC101 Balance:", bank.get_balance("ACC101"))
print("ACC102 Balance:", bank.get_balance("ACC102"))

bank.transfer_funds("ACC101", "ACC102", 1500.0)

print("After Valid Transfer:")
print("ACC101 Balance:", bank.get_balance("ACC101"))
print("ACC102 Balance:", bank.get_balance("ACC102"))

try:
    bank.transfer_funds("ACC101", "ACC102", 10000.0)
except TransactionError as e:
    print(e)

print("After Failed Transfer:")
print("ACC101 Balance:", bank.get_balance("ACC101"))
print("ACC102 Balance:", bank.get_balance("ACC102"))

bank.close()
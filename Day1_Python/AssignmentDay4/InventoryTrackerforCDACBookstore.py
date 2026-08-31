# inventory = {"Python Basics": 10, "Learning AI": 5}
# action = input("Please Enter an Action(add, sell, lookup): ").lower()

# def book_add(book_title,quantity=0):
#     if book_title in inventory.keys():
#       inventory[book_title] += quantity
#     else:
#         inventory[book_title]=0
#         inventory[book_title] += quantity 
#     book_lookup()

# def book_sell(book_title,quantity=0):
#     if book_title in inventory.keys():
#             if inventory[book_title] >= quantity: 
#                 inventory[book_title] -= quantity
#             else:
#                 print(f"only {inventory[book_title]} books are are presnt")
#                 inventory[book_title] = 0
#     else:
#         print("Book is Not present in inventory.")
#     book_lookup()

# def book_lookup():
#     print("")
#     line()
#     print(f"CDAC Bookstore Inventory LookUp:")
#     line()
#     print(f"{"BookName":<15} {"Quantity":<15}")
#     for k, v in inventory.items():
#         print(f"{k:<15} {v:<15}")
#     line()


# def line():
#     print("*"*80)

# def manage_bookstore_inventory(action):

#     if action == 'add':
#         book_title = input("Please Enter a Book Title: ")
#         quantity = int(input("Please Enter the Quantity: "))
#         book_add(book_title,quantity)
#     elif action == 'sell':
#         book_lookup()
#         book_title = input("Please Enter a Book Title: ")
#         quantity = int(input("Please Enter the Quantity: "))
#         book_sell(book_title,quantity)
#     elif action == 'lookup':
#         book_lookup()
#     else:
#         print('Enter Valid Action.')

# manage_bookstore_inventory(action)












inventory = {
    "Python Basics": 10,
    "Learning AI": 5
}


# --------------------------------------------------
# Utility Functions
# --------------------------------------------------

def line():
    print("*" * 70)


def book_lookup():
    print()
    line()
    print("CDAC BOOKSTORE - INVENTORY")
    line()

    print(f"{'Book Name':<30}{'Quantity':>10}")
    line()

    if not inventory:
        print("Inventory is empty.")
    else:
        for book, quantity in inventory.items():
            print(f"{book:<30}{quantity:>10}")

    line()


# --------------------------------------------------
# ADD BOOK
# --------------------------------------------------

def book_add(book_title, quantity=0):

    if quantity <= 0:
        print("Error: Quantity must be greater than 0.")
        return

    if book_title in inventory:
        inventory[book_title] += quantity
        print(f"Successfully added {quantity} copies.")
    else:
        inventory[book_title] = quantity
        print(f"'{book_title}' added to inventory.")

    book_lookup()


# --------------------------------------------------
# SELL BOOK
# --------------------------------------------------

def book_sell(book_title, quantity=0):

    if quantity <= 0:
        print("Error: Quantity must be greater than 0.")
        return

    if book_title not in inventory:
        print(f"Error: Book '{book_title}' not found in inventory.")
        return

    current_stock = inventory[book_title]

    if quantity > current_stock:
        print(
            f"Error: Insufficient stock for '{book_title}'. "
            f"Available: {current_stock}."
        )
        return

    inventory[book_title] -= quantity

    print(f"Successfully sold {quantity} copies of '{book_title}'.")

    # Remove book when stock becomes zero
    if inventory[book_title] == 0:
        del inventory[book_title]
        print(f"'{book_title}' is now out of stock and removed.")

    book_lookup()


# --------------------------------------------------
# SEARCH BOOK
# --------------------------------------------------

def search_book(book_title):

    quantity = inventory.get(book_title, 0)

    print()
    line()

    if book_title in inventory:
        print(f"Book     : {book_title}")
        print(f"Available: {quantity}")
    else:
        print(f"Book '{book_title}' not found.")

    line()


# --------------------------------------------------
# TOTAL STOCK
# --------------------------------------------------

def total_stock():

    total = sum(inventory.values())

    print()
    line()
    print(f"Total different books : {len(inventory)}")
    print(f"Total books in stock  : {total}")
    line()


# --------------------------------------------------
# LOW STOCK REPORT
# --------------------------------------------------

def low_stock_report(limit=5):

    print()
    line()
    print(f"LOW STOCK REPORT (Below {limit})")
    line()

    found = False

    for book, quantity in inventory.items():
        if quantity < limit:
            print(f"{book:<30} {quantity}")
            found = True

    if not found:
        print("No books are currently low in stock.")

    line()


# --------------------------------------------------
# RESTOCK BOOK
# --------------------------------------------------

def restock_book(book_title, quantity):

    if book_title not in inventory:
        print(f"Book '{book_title}' does not exist.")
        return

    if quantity <= 0:
        print("Error: Quantity must be greater than 0.")
        return

    inventory[book_title] += quantity

    print(
        f"'{book_title}' restocked with {quantity} copies."
    )

    book_lookup()


# --------------------------------------------------
# MAIN MENU
# --------------------------------------------------

def manage_bookstore_inventory():

    while True:

        print()
        line()
        print("      CDAC BOOKSTORE INVENTORY SYSTEM")
        line()

        print("1. Add Book")
        print("2. Sell Book")
        print("3. View Inventory")
        print("4. Search Book")
        print("5. Total Stock")
        print("6. Low Stock Report")
        print("7. Restock Book")
        print("8. Exit")

        line()

        choice = input("Enter your choice (1-8): ").strip()

        # ------------------------------------------
        # ADD
        # ------------------------------------------

        if choice == "1":

            book_title = input(
                "Enter Book Title: "
            ).strip()

            try:
                quantity = int(
                    input("Enter Quantity: ")
                )

                book_add(book_title, quantity)

            except ValueError:
                print("Error: Please enter a valid number.")

        # ------------------------------------------
        # SELL
        # ------------------------------------------

        elif choice == "2":

            book_lookup()

            book_title = input(
                "Enter Book Title: "
            ).strip()

            try:
                quantity = int(
                    input("Enter Quantity: ")
                )

                book_sell(book_title, quantity)

            except ValueError:
                print("Error: Please enter a valid number.")

        # ------------------------------------------
        # VIEW INVENTORY
        # ------------------------------------------

        elif choice == "3":

            book_lookup()

        # ------------------------------------------
        # SEARCH
        # ------------------------------------------

        elif choice == "4":

            book_title = input(
                "Enter Book Title to Search: "
            ).strip()

            search_book(book_title)

        # ------------------------------------------
        # TOTAL STOCK
        # ------------------------------------------

        elif choice == "5":

            total_stock()

        # ------------------------------------------
        # LOW STOCK
        # ------------------------------------------

        elif choice == "6":

            try:
                limit = int(
                    input("Enter Low Stock Limit: ")
                )

                if limit < 0:
                    print("Limit cannot be negative.")
                else:
                    low_stock_report(limit)

            except ValueError:
                print("Error: Please enter a valid number.")

        # ------------------------------------------
        # RESTOCK
        # ------------------------------------------

        elif choice == "7":

            book_title = input(
                "Enter Book Title: "
            ).strip()

            try:
                quantity = int(
                    input("Enter Restock Quantity: ")
                )

                restock_book(book_title, quantity)

            except ValueError:
                print("Error: Please enter a valid number.")

        # ------------------------------------------
        # EXIT
        # ------------------------------------------

        elif choice == "8":

            print()
            print("Thank you for using CDAC Bookstore!")
            break

        else:

            print("Invalid choice. Please select 1-8.")


# --------------------------------------------------
# PROGRAM START
# --------------------------------------------------

manage_bookstore_inventory()

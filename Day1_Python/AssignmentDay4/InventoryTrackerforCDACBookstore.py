inventory = {"Python Basics": 10, "Learning AI": 5}

action = input("Please Enter an Action(add, sell, lookup): ").lower()
book_title = input("Please Enter a Book Title: ").lower()
quantity = int(input("Please Enter the Quantity: "))

def manage_bookstore_inventory(inventory, action, book_title, quantity=0):

    if action == 'add':
        if book_title not in inventory:
            print('Hello')
    elif action == 'sell':
        pass
    elif action == 'lookup':
        pass
    else:
        print('Enter Valid Action.')

manage_bookstore_inventory(inventory,action,book_title,quantity)
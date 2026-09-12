inventory = {
    "Python Basics": 10,
    "Learning AI": 5
}


def manage_bookstore_inventory(inventory, action, book_title, quantity=0):

    if action == "add":

        if book_title in inventory:
            inventory[book_title] += quantity
        else:
            inventory[book_title] = quantity

    elif action == "sell":

        if book_title not in inventory:
            print(f"Error: Book '{book_title}' not found in inventory.")

        elif quantity > inventory[book_title]:
            print(
                f"Error: Insufficient stock for '{book_title}'. "
                f"Available: {inventory[book_title]}."
            )

        else:
            inventory[book_title] -= quantity

            if inventory[book_title] == 0:
                del inventory[book_title]

    elif action == "lookup":

        return inventory.get(book_title, 0)

    return inventory


inventory = manage_bookstore_inventory(
    inventory,
    "add",
    "Python Basics",
    5
)

print(inventory)


inventory = manage_bookstore_inventory(
    inventory,
    "sell",
    "Data Science 101",
    1
)

print(inventory)


inventory = manage_bookstore_inventory(
    inventory,
    "sell",
    "Learning AI",
    10
)

print(inventory)


inventory = manage_bookstore_inventory(
    inventory,
    "sell",
    "Learning AI",
    5
)

print(inventory)


print(
    "Python Basics stock:",
    manage_bookstore_inventory(
        inventory,
        "lookup",
        "Python Basics"
    )
)
items = ["staff", "potion", "spellbook"]

item = input("Enter the item: ")

items.append(item)

print("Portal transition activated!")

ejected = items.pop(0)

print(f"Ejected oldest item: {ejected}")
print(f"Current items in the magic bag: {items}")
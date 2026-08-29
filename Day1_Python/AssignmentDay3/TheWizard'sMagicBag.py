list=["staff", "potion", "spellbook"]
item=input("Enter the item:")
list.append(item)

print("Portal transition activated!")
print(f"Ejected oldest item: {list[0]}")
first=list[0]
list.remove(first)
print(f"Current items in the magic bag: {list}")
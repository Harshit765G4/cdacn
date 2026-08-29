list=["coal", "iron", "gold", "coal", "timber", "coal"]

item=input("Enter the item: ").lower()
if item in list:
    print(f"Number of {item} wagons: {list.count(item)}")
    print( f"First {item} wagon is at index: {list.index(item)}")
else:
    print("Resource not found on train!")
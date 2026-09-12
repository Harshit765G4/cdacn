resources = ["coal", "iron", "gold", "coal", "timber", "coal"]

item = input("Enter the item: ").lower()

if item in resources:
    print(f"Number of {item} wagons: {resources.count(item)}")
    print(f"First {item} wagon is at index: {resources.index(item)}")
else:
    print("Resource not found on train!")
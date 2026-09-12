name = input("Enter your full name: ")

parts = name.split()

if len(parts) == 1:
    print(name)
elif len(parts) == 2:
    print(f"{parts[0][0]}. {parts[1]}")
else:
    print(f"{parts[0][0]}. {parts[1][0]}. {parts[-1]}")
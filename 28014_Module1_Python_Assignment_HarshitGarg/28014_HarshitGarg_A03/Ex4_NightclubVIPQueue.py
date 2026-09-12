vip_queue = ['Guido', 'Esha', 'Rajan', 'Kishori']

while True:
    print("Current VIP queue:", vip_queue)
    
    name = input("Enter guest name: ")

    if name == "exit":
        break

    if name in vip_queue:
        vip_queue.remove(name)
        vip_queue.insert(0, name)
        print(f"{name} moved to the front!")
    else:
        print("Access denied. Not on the VIP list.")

    print("Current VIP queue:", vip_queue)
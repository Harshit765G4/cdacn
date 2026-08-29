list = ['Guido', 'Esha', 'Rajan', 'Kishori']
name=""
while name!="exit":
    
    name= input("Enter the guest's name: ")
    if name in list:
        print(f"{name} moved to the front!")
        temp=list.index(name)

        list[0],list[list.index(name)]=name,list[0]
        print("Current VIP queue:",list)
    else:
        print("Access denied. Not on the VIP list.")

    # print("Current VIP queue:",list)
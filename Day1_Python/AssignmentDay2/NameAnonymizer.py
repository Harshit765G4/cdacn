name=input("Enter your fullname:")

list = name.split(" ")

if len(list)==1:
    print(name)
elif len(list)==2:
    print(f"{list[0][0]}.{list[1]}") 
else:
    print(f"{list[0][0]}.{list[1][0]}.{list[2]}")
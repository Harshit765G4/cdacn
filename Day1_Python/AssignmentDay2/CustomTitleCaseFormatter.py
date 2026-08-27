str = input("Enter a string: ")

list=str.split(" ")
# for i in list:
#     print(i[0][0] + i[1].lower(), end=' ')


for i in list:
    print(i.capitalize(),end=" ")
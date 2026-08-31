str= input("Enter the message:")

list = str.split()

res=""
# for i in list:
#     res += f"{i[::-1]} "
# print(res)

res = [i[::-1] for i in list]
print(res)
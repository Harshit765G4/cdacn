str = input("enter: ")
result = ''
for i in str:
    result += chr(ord(i) + 3)
print(result)
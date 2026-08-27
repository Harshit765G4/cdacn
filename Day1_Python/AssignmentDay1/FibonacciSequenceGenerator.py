first=0
second=1
num =int(input("enter the number till you want to find the fibonacci series:"))

# print(first,second)
for i in range(num):
    print(first,end=", ")
    first,second=second,first+second

    
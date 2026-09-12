first = 0
second = 1

num = int(input("Enter the number of terms: "))

for i in range(num):
    print(first, end="")
    if i < num - 1:
        print(", ", end="")
    first, second = second, first + second
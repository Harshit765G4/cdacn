text = input("Enter a text string: ")

i = j = 0
count = 0
while i < len(str):
    while str[i]==str[j]:
        count +=1
        j += 1
    i +=1
    print(str[i] ,count)
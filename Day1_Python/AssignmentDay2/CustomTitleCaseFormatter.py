str = input("Enter a string: ")
list =str.split(" ")

# result=""
# for word in list:
#     result += f"{word[0].upper()}{word[1:].lower()} "

# print(result)
    


def fun(list):
    abc = ''
    for i in list:
        abc += f"{i[0][0]}{i[1:].lower()} "
    return abc

print(fun(list))
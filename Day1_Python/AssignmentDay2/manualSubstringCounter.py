str=input("Enter a string: ")
sub_str=input("Enter a substring to be search: ")

count=0
next=0
for i in str:
    if sub_str in range(len(str) - len(sub_str)):
        next=str.index(sub_str)
        print(count)
        count +=1
        print(count)

print(count)



# start = 0
# end = -1

# for i in str:
#     if sub_str in str[start:end]:
#         next = str.index(sub_str)
#         start += end
#     else:
#         end -= 1

# print(start)
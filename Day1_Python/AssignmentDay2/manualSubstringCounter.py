# str=input("Enter a string: ")
# sub_str=input("Enter a substring to be search: ")

# count=0
# start=0

# for i in str[start:]:
#     if sub_str in str:
#         count += 1
#         start=str.find(sub_str)
# print(count)
# # start = 0
# end = -1

# for i in str:
#     if sub_str in str[start:end]:
#         next = str.index(sub_str)
#         start += end
#     else:
#         end -= 1

# print(start)
# ===============================

str=input("Enter a string: ")
sub_str=input("Enter a substring to be search: ")
count =0
length=0
while length<len(str):
    if sub_str == str[length:length+2]:
        count +=1
    length +=1

print(count)
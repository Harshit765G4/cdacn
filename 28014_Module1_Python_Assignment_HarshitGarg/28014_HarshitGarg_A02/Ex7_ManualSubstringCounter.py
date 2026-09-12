text = input("Enter a string: ")
sub_str = input("Enter a substring to be searched: ")

count = 0
length = 0

while length <= len(text) - len(sub_str):
    if text[length:length + len(sub_str)] == sub_str:
        count += 1
    length += 1

print(count)
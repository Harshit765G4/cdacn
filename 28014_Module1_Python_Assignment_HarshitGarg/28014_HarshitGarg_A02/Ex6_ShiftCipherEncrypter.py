text = input("Enter the text: ")
shift = int(input("Enter the shift: "))

result = ""

for i in text:
    if i.isalpha():
        if i.isupper():
            result += chr((ord(i) - ord('A') + shift) % 26 + ord('A'))
        else:
            result += chr((ord(i) - ord('a') + shift) % 26 + ord('a'))
    else:
        result += i

print(result)
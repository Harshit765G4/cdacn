text = input("Enter a text string: ")

result = ""
i = 0

while i < len(text):
    count = 1

    while i + count < len(text) and text[i] == text[i + count]:
        count += 1

    result += text[i] + str(count)
    i += count

if len(result) < len(text):
    print(result)
else:
    print(text)
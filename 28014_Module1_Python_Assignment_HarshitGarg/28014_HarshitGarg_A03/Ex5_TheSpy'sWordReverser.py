text = input("Enter the message: ")

words = text.split()

res = [word[::-1] for word in words]

print(" ".join(res))
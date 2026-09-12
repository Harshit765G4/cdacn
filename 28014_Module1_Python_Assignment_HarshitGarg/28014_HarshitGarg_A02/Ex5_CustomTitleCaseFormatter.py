text = input("Enter a string: ")
words = text.split()

def fun(words):
    result = ""
    
    for word in words:
        result += word[0].upper() + word[1:].lower() + " "
    
    return result.strip()

print(fun(words))
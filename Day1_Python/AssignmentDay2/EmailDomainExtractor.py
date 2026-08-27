email = input('Enter your Email Address: ')

if not email.__contains__("@"):
    print('Invalid Email')
else:
    str = email.split("@")
    print(str[1])


email = input("Enter your Email Address: ")

if email.count("@") == 1:
    print(email.split("@")[1])
else:
    print("Invalid Email")
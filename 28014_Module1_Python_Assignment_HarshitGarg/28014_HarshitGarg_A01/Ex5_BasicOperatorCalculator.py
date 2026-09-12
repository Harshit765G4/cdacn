num1 = float(input("Enter your first number: "))
num2 = float(input("Enter your second number: "))

op = input("Choose your operator (+, -, *, /): ")

match op:
    case '+':
        print(f"Result: {num1 + num2}")
    case '-':
        print(f"Result: {num1 - num2}")
    case '*':
        print(f"Result: {num1 * num2}")
    case '/':
        if num2 == 0:
            print("Cannot divide by zero.")
        else:
            print(f"Result: {num1 / num2}")
    case _:
        print("Invalid operator.")
class InvalidPhoneNumberError(Exception):
    pass

contact = {}

name = input('Enter Your Name: ')
phone = input('Enter Your Phone Number: ')

def register_contact(phonebook, name, phone_input):
    if not isinstance(name, str) or not name.lstrip() or not all(char.isalpha() or char.isspace() for char in name):
        raise ValueError("Value Error : Contact name must be a non-empty alphabetic string.")

    try:
        int(phone_input)
    except ValueError:
        raise InvalidPhoneNumberError("Invalid Phone Number Error: Phone number must contain digits only.")

    if not phone_input.isdigit():
        raise InvalidPhoneNumberError("Phone number must contain digits only.")

    if len(phone_input) != 10:
        raise InvalidPhoneNumberError("Phone number must contain exactly 10 digits.")

    phonebook[name] = str(phone_input)

    return phonebook

try:
    contact = register_contact(contact, name, phone)
    print("Contact registered successfully!")
    print(contact)

except InvalidPhoneNumberError as err:
    print(err)

except ValueError as err:
    print(err)
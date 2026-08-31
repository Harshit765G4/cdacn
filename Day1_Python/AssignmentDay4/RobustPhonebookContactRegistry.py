class InvalidPhoneNumberError(Exception):
    pass

def register_contact(phonebook, name, phone_input):
    if not isinstance(name, str) or not name.strip() or not all(char.isalpha() or char.isspace() for char in name):
        raise ValueError("Contact name must be a non-empty alphabetic string.")

    try:
        int(phone_input)
    except ValueError:
        raise InvalidPhoneNumberError("Phone number must contain digits only.")

    phonebook[name] = str(phone_input)

    return phonebook

contact = {}

name = input('Enter Your Name: ')
phone = input('Enter Your Phone Number: ')

try:
    contact = register_contact(contact, name, phone)
    print("Contact registered successfully!")
    print(contact)

except InvalidPhoneNumberError as err:
    print(err)

except ValueError as err:
    print(err)
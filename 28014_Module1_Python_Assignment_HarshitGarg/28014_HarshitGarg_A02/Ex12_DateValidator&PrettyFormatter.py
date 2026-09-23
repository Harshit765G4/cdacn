date = input("Enter date (DD/MM/YYYY): ")

parts = date.split("/")

months = (
    "January", "February", "March", "April",
    "May", "June", "July", "August",
    "September", "October", "November", "December"
)

if len(parts) != 3:
    print("Invalid Date")
else:
    day = int(parts[0])
    month = int(parts[1])
    year = int(parts[2])

    days_in_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    if year % 400 == 0 or (year % 4 == 0 and year % 100 != 0):
        days_in_month[1] = 29

    if 1 <= month <= 12 and 1 <= day <= days_in_month[month - 1]:
        print(f"{months[month - 1]} {day}, {year}")
    else:
        print("Invalid Date")
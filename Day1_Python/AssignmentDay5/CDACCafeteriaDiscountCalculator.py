def calculate_cafeteria_bill(base_price, *items, tax_rate=0.05, discount=0.0, delivery_fee=0.0):
    rawSubtotal = base_price + sum(items)
    discountedSubtotal = rawSubtotal * (1 - discount/100)
    tax = discountedSubtotal * tax_rate
    bill = tax + delivery_fee
    finalBill = discountedSubtotal + bill

    return round(finalBill, 2)


total1 = calculate_cafeteria_bill(100.0)
print(total1)
total2 = calculate_cafeteria_bill(100.0, 20.0, 30.0, tax_rate=0.08, discount=10.0, delivery_fee=15.0)
print(total2)
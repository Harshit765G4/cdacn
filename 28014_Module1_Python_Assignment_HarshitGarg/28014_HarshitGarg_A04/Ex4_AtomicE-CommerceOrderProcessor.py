class ProductNotFoundError(Exception):
    pass


class OutOfStockError(Exception):
    pass


catalog = {
    "P01": {"price": 100.0, "stock": 5},
    "P02": {"price": 50.0, "stock": 2}
}


def process_order(catalog, order):
    for product_id, quantity in order.items():
        if product_id not in catalog:
            raise ProductNotFoundError(
                f"Product '{product_id}' not found in store catalog."
            )

        if quantity > catalog[product_id]["stock"]:
            raise OutOfStockError(
                f"Product '{product_id}' is out of stock. "
                f"Requested: {quantity}, "
                f"Available: {catalog[product_id]['stock']}."
            )

    bill = 0.0

    for product_id, quantity in order.items():
        catalog[product_id]["stock"] -= quantity
        bill += catalog[product_id]["price"] * quantity

    return bill


try:
    total = process_order(catalog, {"P01": 22, "P02": 1})
    print(f"This is your final bill: {total}rs")

except ProductNotFoundError as e:
    print(e)

except OutOfStockError as e:
    print(e)
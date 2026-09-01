class ProductNotFoundError(Exception): 
    pass
class OutOfStockError(Exception): 
    pass

catalog = {
    "P01": {"price": 100.0, "stock": 5},
    "P02": {"price": 50.0, "stock": 2}
}

def process_order(catalog, order):
    bill=0
    for i in order.keys():
        if i not in catalog.keys():
            raise ProductNotFoundError(f"Product {i} not found in store catalog")
        elif catalog[i]["stock"] < order[i]:
            raise OutOfStockError(f"Product {i} is out of stock. Requested: {order[i]}, Available: {catalog[i]["stock"]}.")
        else:
            bill += catalog[i]["price"] * order[i]
    print(f"This is your final bill: {bill}rs")
try:
    total = process_order(catalog, {"P01": 22, "P02": 1}) 
except ProductNotFoundError as e:
    print(e)
except OutOfStockError as e:
    print(e)


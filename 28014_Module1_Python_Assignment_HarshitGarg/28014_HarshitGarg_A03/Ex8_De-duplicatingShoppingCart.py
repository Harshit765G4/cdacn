data = ["apple", "banana", "apple", "orange", "banana", "banana"]

res = []

for i in data:
    if i not in res:
        res.append(i)

print(res)
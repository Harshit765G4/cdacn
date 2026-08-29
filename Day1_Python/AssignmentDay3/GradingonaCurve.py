list = input("Enter the marks separated by space:")
scores = list.split()
score = [int(num) for num in scores]

print("original:",scores)

score = [i+10 for i in list if i <= 50]

print("curved:",score)
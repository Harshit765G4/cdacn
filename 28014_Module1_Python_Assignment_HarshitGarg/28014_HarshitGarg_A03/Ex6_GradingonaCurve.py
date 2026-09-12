marks = input("Enter the marks separated by space: ")

scores = [int(num) for num in marks.split()]

curved = [min(100, score + 10 if score < 50 else score + 5) for score in scores]

print("Original:", scores)
print("Curved:", curved)
list=["Inception", "The Matrix", "Interstellar"]
movie=input("Enter a movie:")

if movie in list:
    print("already added!")
else:
    list.append(movie)

cap = [word.capitalize() for word in list]
cap.sort()
print(cap)
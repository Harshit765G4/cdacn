movies = ["Inception", "The Matrix", "Interstellar"]

movie = input("Enter a movie: ")

if movie in movies:
    print("Already added!")
else:
    movies.append(movie)
    print(f"Added {movie}!")

movies.sort()

print(f"Alphabetical Playlist: {movies}")
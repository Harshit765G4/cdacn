def compile_feedback(ratings_dict):
    result = {}

    for course,ratings in ratings_dict.items():
        valid_ratings = []

        for val in ratings:
            try:
                valid_ratings.append(float(val))
            except (ValueError, TypeError):
                print(f"Warning: Invalid rating value '{val}' "f"in course '{course}' skipped.")

        try:
            average = sum(valid_ratings) / len(valid_ratings)
            result[course] = round(average, 2)
        except ZeroDivisionError: 
            print(f"Warning: No valid ratings found for course '{course}'. "f"Rating set to 0.0.")
            result[course] = 0.0

    return result

ratings_dict = {
    "Python Programming": [5, 4, "4", "Great", 5],
    "Machine Learning": [],
    "Deep Learning": ["Good", "Average", None],
    "c++" : [1,2,3,5]
}

print(compile_feedback(ratings_dict))
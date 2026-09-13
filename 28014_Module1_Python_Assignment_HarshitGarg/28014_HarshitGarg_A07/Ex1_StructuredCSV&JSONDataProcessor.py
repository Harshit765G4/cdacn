import csv
import json
import os


def process_student_records(input_csv_path, output_json_path):
    students = []
    course_counts = {}
    total_score = 0.0

    with open(input_csv_path, "r", newline="", encoding="utf-8") as file:
        reader = csv.DictReader(file)

        for row in reader:
            score = float(row["score"])

            students.append({
                "name": row["name"],
                "score": score
            })

            total_score += score

            course = row["course"]
            course_counts[course] = course_counts.get(course, 0) + 1

    total_students = len(students)

    if total_students > 0:
        average_score = round(total_score / total_students, 2)
        top_scorer = max(students, key=lambda student: student["score"])
    else:
        average_score = 0.0
        top_scorer = None

    summary = {
        "total_students": total_students,
        "average_score": average_score,
        "top_scorer": top_scorer,
        "course_counts": course_counts
    }

    with open(output_json_path, "w", encoding="utf-8") as file:
        json.dump(summary, file, indent=4)

    return summary


folder = os.path.dirname(os.path.abspath(__file__))

input_csv = os.path.join(folder, "students.csv")
output_json = os.path.join(folder, "summary.json")

result = process_student_records(input_csv, output_json)

print(json.dumps(result, indent=4))
print("Processing completed successfully.")
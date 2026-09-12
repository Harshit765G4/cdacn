import csv
import json


def process_student_records(input_csv_path, output_json_path):
    students = []
    course_counts = {}
    total_score = 0.0

    with open(input_csv_path, "r", newline="") as file:
        reader = csv.DictReader(file)

        for row in reader:
            score = float(row["score"])

            student = {
                "name": row["name"],
                "score": score
            }

            students.append(student)
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

    with open(output_json_path, "w") as file:
        json.dump(summary, file, indent=4)
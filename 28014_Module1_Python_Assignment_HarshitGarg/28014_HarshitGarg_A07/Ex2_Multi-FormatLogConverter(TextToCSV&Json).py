import csv
import json
import os


def convert_log_file(input_log_path, output_csv_path, output_json_path):
    records = []

    with open(input_log_path, "r", encoding="utf-8") as file:
        for line in file:
            line = line.strip()

            if not line:
                continue

            timestamp, user_id, endpoint, status_code = line.split("|")

            record = {
                "timestamp": timestamp.strip(),
                "user_id": user_id.strip(),
                "endpoint": endpoint.strip(),
                "status_code": int(status_code.strip())
            }

            records.append(record)

    with open(output_csv_path, "w", newline="", encoding="utf-8") as file:
        fieldnames = ["timestamp", "user_id", "endpoint", "status_code"]

        writer = csv.DictWriter(file, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(records)

    with open(output_json_path, "w", encoding="utf-8") as file:
        json.dump(records, file, indent=2)

    return records


folder = os.path.dirname(os.path.abspath(__file__))

input_log = os.path.join(folder, "server_access.log")
output_csv = os.path.join(folder, "access_records.csv")
output_json = os.path.join(folder, "access_records.json")

result = convert_log_file(input_log, output_csv, output_json)

print(json.dumps(result, indent=2))
print("Conversion completed successfully.")
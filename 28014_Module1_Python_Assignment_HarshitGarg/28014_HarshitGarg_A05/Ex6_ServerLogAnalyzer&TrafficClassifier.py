import re
from pprint import pprint


def analyze_server_logs(logs_text):
    pattern = re.compile(
        r'^(?P<ip>\S+) - - '
        r'\[(?P<time>[^\]]+)\] '
        r'"(?P<method>GET|POST|PUT|DELETE) '
        r'(?P<resource>\S+) '
        r'(?P<version>HTTP/\S+)" '
        r'(?P<status>\d+) '
        r'(?P<bytes>\d+)$'
    )

    result = []

    for line in logs_text.splitlines():
        match = pattern.match(line)

        if not match:
            print(f"Warning: Could not parse line: '{line}'. Skipping.")
            continue

        data = match.groupdict()

        if data["ip"].startswith("192.168.") or data["ip"].startswith("10."):
            continue

        result.append({
            "ip": data["ip"],
            "time": data["time"],
            "method": data["method"],
            "resource": data["resource"],
            "status": int(data["status"]),
            "bytes": int(data["bytes"])
        })

    return result


log_data = """192.168.1.5 - - [28/Aug/2026:10:00:00] "GET /index.html HTTP/1.1" 200 1024
8.8.8.8 - - [28/Aug/2026:10:10:00] "GET /api/v1/users HTTP/1.1" 200 4096
Corrupted log entry here
10.0.0.12 - - [28/Aug/2026:10:15:00] "POST /submit_data HTTP/1.1" 403 512
172.16.0.4 - - [28/Aug/2026:10:20:00] "POST /login HTTP/1.1" 401 256"""

pprint(analyze_server_logs(log_data))
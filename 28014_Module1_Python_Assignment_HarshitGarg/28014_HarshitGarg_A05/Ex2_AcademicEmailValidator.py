import re


def validate_academic_email(email):
    pattern = r'^[a-z0-9._]+@[a-z0-9.-]+(\.edu|\.res\.in)$'
    return bool(re.match(pattern, email))


print(validate_academic_email("arham.khan@cdac.res.in"))
print(validate_academic_email("lisa_stud12@mit.edu"))
print(validate_academic_email("vinod@gmail.com"))
print(validate_academic_email("ALICE@college.edu"))
print(validate_academic_email("bob@mit.edu.com"))
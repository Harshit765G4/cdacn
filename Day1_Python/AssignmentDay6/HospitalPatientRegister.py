import re

class Patient:
    _patient_counter = 0

    @staticmethod
    def validate_dob_format(dob_str):
        # pattern = r"^{\d4}-{\d2}-{\d2}$"
        pattern = r"^(\d{4}-\d{2}-\d{2})$"
        return bool(re.fullmatch(pattern, dob_str))

    def __init__(self, name, dob):
        if not Patient.validate_dob_format(dob):
            raise ValueError(f"Invalid date of birth format: {dob}. Expected YYYY-MM-DD.")
        else:
            Patient._patient_counter += 1

        self.patient_id = f"PAT-{1000 + Patient._patient_counter}"

        self.name = name
        self.dob = dob

    @classmethod
    def get_total_patients(cls):
        return cls._patient_counter

p1 = Patient("Arham Khan", "1999-05-15")
print(p1.patient_id)

p1 = Patient("amir Khan", "1999-02-25")
p1 = Patient("salman Khan", "1999-11-03")
try:
    p2 = Patient("Lisa", "12/08/1998")
except ValueError as e:
    print(e)

print(Patient.get_total_patients())






# import re


# class Patient:
#     _patient_counter = 0

#     @staticmethod
#     def validate_dob_format(dob_str):
#         pattern = r"^\d{4}-\d{2}-\d{2}$"
#         return bool(re.fullmatch(pattern, dob_str))

#     def __init__(self, name, dob):
#         if not Patient.validate_dob_format(dob):
#             raise ValueError(
#                 f"Invalid date of birth format: '{dob}'. Expected YYYY-MM-DD."
#             )

#         Patient._patient_counter += 1

#         self.patient_id = f"PAT-{1000 + Patient._patient_counter}"
#         self.name = name
#         self.dob = dob

#     @classmethod
#     def get_total_patients(cls):
#         return cls._patient_counter


# # 1. Valid Registration
# p1 = Patient("Arham Khan", "1999-05-15")
# print(p1.patient_id)

# # 2. Invalid DOB registration
# try:
#     p2 = Patient("Lisa", "12/08/1998")
# except ValueError as e:
#     print(e)

# print(Patient.get_total_patients())
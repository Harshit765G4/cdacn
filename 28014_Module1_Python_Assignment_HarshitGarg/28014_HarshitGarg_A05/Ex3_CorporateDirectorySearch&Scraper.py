import re


def scrape_directory_phones(directory_text):
    pattern = re.compile(
        r'(?:'
        r'(\d{3})-(\d{3})-(\d{4})'
        r'|'
        r'\((\d{3})\) (\d{3})-(\d{4})'
        r'|'
        r'(\d{3})(\d{3})(\d{4})'
        r')'
    )

    result = []

    for match in pattern.finditer(directory_text):
        groups = match.groups()

        if groups[0]:
            area_code, prefix, line_number = groups[0], groups[1], groups[2]
        elif groups[3]:
            area_code, prefix, line_number = groups[3], groups[4], groups[5]
        else:
            area_code, prefix, line_number = groups[6], groups[7], groups[8]

        result.append({
            "area_code": area_code,
            "prefix": prefix,
            "line_number": line_number,
            "formatted": f"({area_code}) {prefix}-{line_number}"
        })

    return result


directory = "Contact HR at 123-456-7890 or the helpdesk at (987) 654-3210. Direct line is 5558881234."

print(scrape_directory_phones(directory))
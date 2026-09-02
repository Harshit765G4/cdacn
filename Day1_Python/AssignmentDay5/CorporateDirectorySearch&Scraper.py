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

    for i in pattern.finditer(directory_text):
        groups = i.groups()

    print(groups)

directory = "Contact HR at 123-456-7890 or the helpdesk at (987) 654-3210. Direct line is 5558881234."
scrape_directory_phones(directory)
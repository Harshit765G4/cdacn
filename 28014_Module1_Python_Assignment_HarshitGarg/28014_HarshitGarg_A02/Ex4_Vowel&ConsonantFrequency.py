text = input("Enter a string: ")

counts = {"a": 0, "e": 0, "i": 0, "o": 0, "u": 0}
consonants = 0

for i in text.lower():
    if i.isalpha():
        if i in "aeiou":
            counts[i] += 1
        else:
            consonants += 1

print("Vowel Frequencies:")
for vowel, count in counts.items():
    print(f"{vowel}: {count}")

print("Total Consonants:", consonants)
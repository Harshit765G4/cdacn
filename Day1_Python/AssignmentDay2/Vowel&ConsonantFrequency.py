# str=input("Enter a string: ")
# vowels =0
# consonants=0
# vowelsCount = ""
# checkStr='aeiou'
# a = 0
# for i in str.lower():
#     if i.isalpha():
#         if i in checkStr:
#                 vowelsCount +=i
#                 vowels+=1
#         else:
#             consonants+=1

# print("vowels = ",vowels)

# print("consonants = ",consonants)

# print("vowels count=",vowelsCount)

str=input("Enter a string: ")
counts={"a":0,"e":0,"i":0,"o":0,"u":0}
vowels =0
consonants=0


for i in str.lower():
    if i in "aeiou":
        vowels += 1
        counts[i] += 1
    else:
        consonants += 1

print("vowels:",vowels,counts)
print("consonents:",consonants)

str=input("Enter a string: ")
vowels =0
consonants=0
vowelsCount = ""
checkStr='aeiou'
a = 0
for i in str.lower():
    if i.isalpha():
        if i in checkStr:
                vowelsCount +=i
                vowels+=1
        else:
            consonants+=1

print("vowels = ",vowels)

print("consonants = ",consonants)

print("vowels count=",vowelsCount)
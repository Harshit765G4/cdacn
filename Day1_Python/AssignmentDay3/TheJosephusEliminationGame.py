n = int(input('Enter the n: '))
k = int(input('Enter the k: '))
lst=[]

for i in range(1,n+1):
    lst.append(i)
    
print("Soldier circle initialized: ",lst)
index = 0

while len(lst) > 1:
    index = (index + k - 1) % len(lst)
    soldier = lst.pop(index)
    print(f'Eliminated soldier: {soldier} (Remaining: {lst})')

print(f'The sole survivor is: {lst[0]}')
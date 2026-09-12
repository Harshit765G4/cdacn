n = int(input("Enter the n: "))
k = int(input("Enter the k: "))

soldiers = list(range(1, n + 1))

print("Soldier circle initialized:", soldiers)

index = 0

while len(soldiers) > 1:
    index = (index + k - 1) % len(soldiers)
    soldier = soldiers.pop(index)
    print(f"Eliminated soldier: {soldier} (Remaining: {soldiers})")

print(f"The sole survivor is: {soldiers[0]}")
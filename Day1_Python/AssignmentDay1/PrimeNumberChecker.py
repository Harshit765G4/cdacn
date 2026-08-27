num=int(input("enter a number:"))

is_prime=True

for i in range(2,(num//2)+1):
    if num%i==0:
        is_prime=False
        break
if is_prime:
    print(num,"is prime a prime number")
else:
    print("not it is not a prime")

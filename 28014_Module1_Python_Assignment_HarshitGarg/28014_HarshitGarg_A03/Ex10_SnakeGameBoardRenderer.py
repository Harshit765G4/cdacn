r = int(input('Enter a row: '))
c = int(input('Enter a column: '))

for i in range(5):
    for j in range(5):
        if r==i and c==j:
            print("s",end=" ")
        else:       
            if i == 2 and j == 3:
                if r == i and c == j:
                    print('S',end=' ') 
                else:
                    print('F',end=' ')
            else:
                print('.',end=' ')
    print( )
if r == 2 and c == 3:
    print('Yum! The snake ate the food!')
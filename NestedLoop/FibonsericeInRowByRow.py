num=int(input("Enter the number.."))

for i in range(1,num+1):
    a=0
    b=1
    c=a+b
    for j in range(1,i+1):
        print(a, end=" ")
        a=b
        b=c
        c=a+b
    print()
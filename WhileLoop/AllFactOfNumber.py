num=int(input(f"Enter the Number: "))
i=1
print(f"factors of {num} =",end=" ")
while num>=i:
    if(num%i==0):
        print(i,end=" ")
    i=i+1
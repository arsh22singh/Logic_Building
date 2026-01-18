num=int(input(f"Enter the Number: "))
i=1
sum=0
print(f"factors of {num} =",end=" ")
while num>=i:
    if(num%i==0):
        print(i,end=" ")
        sum=sum+i
    i=i+1
print(f"\nSum of factors!= {sum}")
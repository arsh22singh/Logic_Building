num=int(input("Enter the number:"))
dig=0
sum=0
while num>=1:
    dig=num%10
    sum=sum+dig
    num//=10
print("Sum of digite Is ", sum)
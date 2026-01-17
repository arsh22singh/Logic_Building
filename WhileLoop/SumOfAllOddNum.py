num=int(input("Enter the number:"))
sum=0

while num>=1:
    if(num%2!=0):
        sum=sum+num
    num=num-1
print(f"Sum of All even number in N position:={sum}")
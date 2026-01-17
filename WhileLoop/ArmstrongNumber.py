num=int(input("Enter the number:"))
temp=num
sum=0
num_str=str(num)
a=len(num_str)
while num>=1:
    pwa=0
    dig=num%10
    paw=dig*dig*dig
    sum=sum+paw
    num//=10
if(sum==temp):
    print("Number is Armstrong")
else:
    print("Not a Armstrong")

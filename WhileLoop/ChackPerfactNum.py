num=int(input("Enter the number:"))
temp=num
i=1
sum=0
while num>i:
    if(num%i==0):
        sum=sum+i
    i=i+1
if(temp==sum):
    print("This is a Perfact Number",sum)
else:
    print("Not a perfact number")

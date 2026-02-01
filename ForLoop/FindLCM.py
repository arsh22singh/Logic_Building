num=int(input("enter the First Number.."))
num2=int(input("Enter the Second number..."))
lcm=1
if(num>=num2):
    size=num
    for i in range(1,size+1):
        if(num%i==0):
            num/=i
            lcm=lcm*i
        if(num2%i==0):
            num2/=i
            lcm=lcm*i
else:
    size=num2
    for i in range(1,size+1):
        if(num%i==0):
            num/=i
            lcm*=i
        if(num2%i==0):
            num2/=i
            lcm*=i
print(lcm)

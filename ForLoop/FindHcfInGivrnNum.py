# Find the HCF (Highest Common Factor) of the given numbers.


num=int(input("enter the first number"))
num2=int(input("Enter the second number"))

hcf=0
if(num>=num2):
    for i in range(num2,num+1):
        for j in range(1,num+1):
            if(num2%j==0 and num%j==0):
                hcf=j
else:
    for i in range(num,num2+1):
        for j in range(1,num2+1):
            if(num%j==0 and num2%j==0):
                hcf=j

print(hcf)
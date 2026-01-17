num=int(input("Enter the number"))
a,b=0,1
i=0
sum=0
while num>i:
    print(a)
    sum=sum+a
    temp=a+b
    a=b
    b=temp
    i=i+1
print("Sum of Fibnoacci Serics is ",sum)


num=int(input("Entr the first number"))
num2=int(input("enter the second Numer"))
while num2>=num:
    i=1
    count=0
    while num>=i:
        if(num%i==0):
            count=count+1
        i=i+1
    if(count==2):
        print(num, end=" ")
    num=num+1
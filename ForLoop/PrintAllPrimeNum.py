#Print all prime numbers between i and Nth.

num =int(input("Enter the First Number!.."))
num2= int(input("Enter the second Number!.."))

for num in range(num,num2+1):
    count=0
    for i in range(1,num+1):
        if(num%i==0):
            count+=1

    if(count==2):
        print(num, end=" ")
"""Calculate and print the factorial of every number from 1 to n. """
# 1= 1
# 2= 1,2
# 3= 1,3
# 4= 1,2,4


num1=int(input("Enter the first Number!.."))
num2=int(input("Enter the second Number!.."))

if(num1>num2):
    for num2 in range(num2,num1+1):
        for k in range(1,num2+1):
            if(num2%k==0):
                print(k,end=" ")
        print("\n")
else:
    for num1 in range(num2+1):
        for i in range(1,num1+1):
            if(num1%i==0):
                print(i,end=" ")
        print("\n")
"""Find and print the sum of the first n natural numbers."""

num=int(input("Enter the Num.."))
num=(num*(num+1)/2)
print("Sum of Number ",num)

"""Find and print the sum of the first n even numbers."""
sum=0
num1=int(input("Enter the Number "))
for i in range(1,num1+1):
    if(i%2==0):
        sum=sum+i
        print(i,end=" ")
print("Sum of Natural Num ",sum)
sun=0
for i in range(1,num1+1):
    if(i%2!=0):
        sun=sun+i
        print(i,end=" ")
print("Sum of Odd Number =" ,sun)
""" Find and print the sum of the first n odd numbers. """


    
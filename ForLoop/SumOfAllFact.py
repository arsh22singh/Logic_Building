# Find and print the sum of all factors of the given number.
num=int(input("Enter the Numbre!..."))
sum=0
for i in range(1,num+1):
    if(num%i==0):
        sum+=i
        print(i)
print("Sum of Factor is = ",sum)
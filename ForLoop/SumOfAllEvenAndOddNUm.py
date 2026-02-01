num=int(input("Enter the num.."))

evenSum=0
oddsum=0

for i in range(1,num+1):
    if(i%2!=0):
        oddsum+=i
    else:
        evenSum+=i
print(f"Sum of odd number 1 to {num} is =",oddsum)
print(f"Sum of even number 1 to {num} is =",evenSum)
# Print the sum of  Fibonacci series up to the required number of terms. 
import time

num=int(input("Enter the  number!.."))

A=0
B=1
C=A+B
sum=0

for i in range(num):
    
    print(A,end=" ", flush=True)
    sum=sum+A
    time.sleep(0.3)
    A=B
    B=C
    C=A+B
print("\n Sum of Fibo serise is = ",sum)
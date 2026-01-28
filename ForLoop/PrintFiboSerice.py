# Print the Fibonacci series up to the required number of terms. 
import time

num=int(input("Enter the  number!.."))

A=0
B=1
C=A+B

for i in range(num):
    
    print(A,end=" ", flush=True)
    time.sleep(0.3)
    A=B
    B=C
    C=A+B

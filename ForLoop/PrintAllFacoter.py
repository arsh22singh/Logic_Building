# Print all factors of the given number. 

num=int(input("Enter the number..."))

for i in range(1,num):
    if(num%i==0):
        print(i,end=" ")
num=int(input("Enter the number:"))
a=num
count=0
while num>=1:
    if(num%10):
        count=count+1
    num//=10
print(f"Total num of Digit In this {a} is {count}")

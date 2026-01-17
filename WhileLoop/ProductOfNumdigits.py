num=int(input("Enter the number:"))
product=1
while num>1:
    dig=num%10
    product=product*dig
    num//=10
print(f"{product}")

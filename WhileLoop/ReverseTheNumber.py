num=int(input("Enter the number:"))

while num>=1:
    dig=num%10
    print(dig,end="")
    num//=10
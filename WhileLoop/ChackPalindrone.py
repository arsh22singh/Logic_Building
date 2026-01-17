num=int(input("Enter the number:"))
temp=num
rev=0
while(num>=1):
    rev=(rev*10)+(num%10)
    num//=10

if(rev==temp):
    print(f"Yes this is palindrone Number")
else:
    print(f"Yes this is  not palindrone Number")

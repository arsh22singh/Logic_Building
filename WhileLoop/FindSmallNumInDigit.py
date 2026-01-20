num=int(input("Enter the Number..."))
a=num
while num>1:
    dig=num%10
    if(a>=dig):
        a=dig
    num//=10
print(a)
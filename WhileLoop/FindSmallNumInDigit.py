num=int(input("Enter the Number..."))
a=0
while num>1:
    dig=num%10
    if(a>=dig):
        a=dig
    else:
        a=dig
    num//=10
print(a)
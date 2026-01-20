num=int(input("Entre the number..."))
a=0
while(num>1):
    dig=num%10
    if(a<=dig):
        a=dig
    num=num//10
print(a)
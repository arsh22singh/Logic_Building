Num=int(input("Enter the Number."))
for i in range(1,Num+1):
    count=0
    for j in range(1,i+1):
        if(Num%j==0):
            count=count+1
    print(f"{i} tatal factor ",count)

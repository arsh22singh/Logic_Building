tar=int(input("Enter the targate Number "))

list1=[1,2,4,3,6]
n=len(list1)
print(list1[0])
print(n)
i,j=0,0
for i in range(n):
    for j in range(i,n):
        if((list1[i]+list1[j])==tar):
            print("Index of ",i ," and ",j," sum equal to Targate = ",tar)
        

""" Calculate and print the factorial of a given number."""

num=int(input("Enter the Number....!"))
list1=[]
sum=0
i = 1
for i in range(i,num):
    if(num% i ==0):
        sum+=i
        list1.append(i)
print(list1)
print(sum)
    
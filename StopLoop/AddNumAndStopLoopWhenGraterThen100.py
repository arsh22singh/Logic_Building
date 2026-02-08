"""Continuously add numbers in a loop and stop the loop when the sum becomes 
greater than 100"""
num=1
sum=0
last=int(input("Enter The num.."))
while num<=last:
    sum+=num
    if(sum>100):
        break
    num+=1
print(sum)

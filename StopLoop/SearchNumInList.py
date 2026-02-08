""" Search for a specific number in a list of inputs, and terminate the loop immediately 
when the number is found."""
list1=[2,1,3,4]
num=int(input("Enter the search number!.. = "))
count=0
a=len(list1)
for i in range(a):
    if(num==list1[i]):
        print(f"{list1[i]} are persent in {i} index")
        count+=1
        break

if(count==0):
    print("nOT FOUND!")

"""Print all Pythagorean triplets whose values are less than or equal to n."""

num=int(input("Enter the Number.."))


for i in range(1,num+1):
    for j in range(i,num):
        ABsqu=(i**2)+(j**2)
        Hsqu=int(ABsqu**0.5)
        if(ABsqu == Hsqu**2 and Hsqu <=num):
            print(i,j,Hsqu,)
    
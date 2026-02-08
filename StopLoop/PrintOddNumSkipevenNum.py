""" Skip all odd numbers and print only the even numbers. """
i=1
while(i<=100):
    if(i%2==0):
        i+=1
        continue
    else:
        print(i,end=" ")
    i+=1
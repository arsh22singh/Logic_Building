"""Keep taking numbers from the user and print them until a negative number 
appears, then stop the loop. """
num=0
while num>=0:
    num=int(input("Enter the Number.."))
    if(num>=0):
        print("Num is ",num)
    else:
        break
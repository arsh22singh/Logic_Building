def table(num):
    for _ in range(1,11):
        print(num ,"x" ,_," = ",num*_)
    

def Input():
    num=int(input("Enter The Number.."))
    table(num)

print("Start")
Input()
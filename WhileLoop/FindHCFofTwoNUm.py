f_num=int(input("Emter the first number.."))
s_num=int(input("Enter the second Number"))

i=1
hcf=0
while(f_num>=i):
    if(f_num%i==0 and s_num%i==0):
        hcf=i
    i+=1
print(hcf)
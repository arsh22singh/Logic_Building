f_num=int(input("Emter the first number.."))
s_num=int(input("Enter the second Number"))
lcm=0
l=0
hcf=1
i=1
while(f_num>=i):
    if(f_num%i==0 and s_num%i==0):
        hcf=i
    i+=1
print(hcf)
l=(f_num*s_num)
lcm=l/hcf
print(lcm)
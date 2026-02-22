RED=int(input("Enter the Number Of Red Boll  = "))
GREEN=int(input("Enter the Number Of Green Boll = "))
BLUE=int(input("Enter the Number Of Blue Boll = "))
print("Sum of all Bolls ")
A=1
SUM=RED+GREEN+BLUE
for i  in range(SUM,1,-1):
    A*=i
print("Toatl num of count =",A)
# #Take 5 numbers as input, skip any number that is 0 using continue, and
# calculate the sum of the remaining numbers.
sum=0
for i in range(5):
    num=int(input(f"{i+1} Enter the Number.. = "))
    if(num>0):
        sum=sum+num
    else:
        continue
print(f"Sum of five number {sum}")
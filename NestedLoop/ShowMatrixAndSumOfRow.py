# Print a matrix, then calculate and display the sum of each row and the sum of each column

list1=[[1,2,3],[4,5,6],[7,8,9]]
for i in range(len(list1)):
    sum=0
    ao=0
    for j in range(len(list1)):
        sum+=list1[i][j]
        print(list1[i][j], end=" ")
        ao+=list1[j][i]
        
    print("   Sum of Row  and Sum of Column = ",sum," , ",ao)

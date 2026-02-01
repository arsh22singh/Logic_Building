for i in range(1,10+1):
    for j in range(1,10+1):
        print(f" {j} x {i} ={i*j} ".ljust(2),'|',end="\t")
    print()
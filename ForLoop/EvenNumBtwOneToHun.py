class even:
    def findEven(self,num,num2):
        for _ in range(num,num2+1,):
            if(_%2==0):
                print(_,end=' ')


num=int(input("Start Number!..."))
num2=int(input("End Number!..."))
obj=even()
obj.findEven(num,num2)


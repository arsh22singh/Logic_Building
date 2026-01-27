
class Main1:
    def Input(self):
        self.num1=int(input("Start Number..."))
        self.num2=int(input("End Number..."))

class childd(Main1):
    def PrintOdd(self):
        for _ in range(self.num1,self.num2+1):
            if(_%2!=0):
                print(_,end=" ")

obj=childd()
obj.Input()
obj.PrintOdd()
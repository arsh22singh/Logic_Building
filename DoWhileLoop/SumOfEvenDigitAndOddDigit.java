package DoWhileLoop;

import java.util.Scanner;
class a{
    public int EvenFun(int num){
        int total=0;
        int i=1;
        do{
            int dig=num%10;
            if(i%2==0){
                total+=dig;
            }
            i++;
            num/=10;
        }while(num>0);
        
        return total;
    }
}
class B{
    public int OddFun(int num){
        int total2=0;
        int i=1;
        do{
            int dig=num%10;
            if(i%2!=0){
                total2+=dig;
            }
            num/=10;
            i++;

        }while(num>0);
    return total2;
}
    }

public class SumOfEvenDigitAndOddDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a obj=new a();
        B obj2=new B();
        System.out.println("Enter the NUmber ");
        int num=sc.nextInt();
        int Esum=obj.EvenFun(num);
        int Osum=obj2.OddFun(num);
        System.out.println("Sum Of Even digit = "+Esum);
        System.out.println("Sum Of Odd digit = "+Osum);
        sc.close();
    }
}

package DoWhileLoop;

import java.util.Scanner;

class SumOfDigitClass{
    int total=0;
    public int Sum(int num){
        do{
            int dig=num%10;
            total+=dig;
            num/=10;
        }while(num>0);
        return total;
    }
}

public class SumOFDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SumOfDigitClass obj=new SumOfDigitClass();
        System.out.println("Enter the Number..");
        int num =sc.nextInt();
        int result=obj.Sum(num);
        System.out.println("Sum Of DigitS = "+result);
        sc.close();
    }
}

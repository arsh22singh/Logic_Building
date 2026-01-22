package DoWhileLoop;

import java.util.Scanner;

class reverse{
    public int NumverReverse(int n){
        int dig=0;
        do{
        dig=(dig*10)+(n%10);
        n/=10;
        }while(n>0);
        return dig;
    }
}
public class reverseTheNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        reverse obj=new reverse();
        System.out.println("Enter the num : ");
        int num=sc.nextInt();
        int rev=obj.NumverReverse(num);
        System.out.print(rev);
        sc.close();
    }
}

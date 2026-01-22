package DoWhileLoop;

import java.util.Scanner;

class Pandron{
    public void chakpan(int num,int rev){
        if(num==rev){
            System.out.println("\n This Number is Palindrone!...");
        }
        else{
            System.out.println("\n This Number is Not Palindrone!...");
        }
    }
}
class reverseClass{
    public int reverseNum(int n){
        int dig=0;
        do{
            dig=(dig*10)+(n%10);
            n/=10;
        }while(n>0);
        return dig;
    }
}
public class chackNumPlaindrone {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        reverseClass rObj=new reverseClass();
        Pandron pObj=new Pandron();
        System.out.print("Enter the Number!:- ");
        int num=sc.nextInt();
        int r=rObj.reverseNum(num);
        System.err.print("Reverse number is "+r);
        pObj.chakpan(num, r);
        sc.close();
    }
}

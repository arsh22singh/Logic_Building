
/* Armestrong number.................... */
package DoWhileLoop;

import java.util.Scanner;

class ChackNum{
    public  int ChackArm(int num){
        int total=0;
        do{
            int dig=0;
            dig=num%10;
            total=total+(dig*dig*dig);
            num/=10;
        }while(num>0);
        return total;
    }
}

public class ArmestrongNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ChackNum obj=new ChackNum();
        System.out.println("Enter the num!..");
        int num=sc.nextInt();
        int a=obj.ChackArm(num);
        if(num==a){
            System.err.println("This is a armestorng!...");
        }else{
            System.out.println("Not armestromg...");
        }
        sc.close();

    }
}

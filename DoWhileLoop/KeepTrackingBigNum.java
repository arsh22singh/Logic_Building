

/* Keep taking numbers from the user until 0 is entered, then print the largest number 
among all inputs.*/

package DoWhileLoop;

import java.util.Scanner;

class InnerKeepTrackingBigNum {
    public int fun( Scanner sc){
        int num=0;
        int big=0;
        do{
            System.out.print("Enter the number:");
            num=sc.nextInt();
            if(num>big){
                big=num;
            }
        }while(num!=0);
        return big;
    }
}

public class KeepTrackingBigNum {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    InnerKeepTrackingBigNum n=new InnerKeepTrackingBigNum();
    int a = n.fun(sc);
    System.out.println("Big number"+a);
    }
}

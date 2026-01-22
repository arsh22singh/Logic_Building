package DoWhileLoop;

import java.util.*;


public  class KeepTrackingNumberAndPrintSumOFAllNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total =0;
        int num=0;
        do{
        System.out.println("Enetr the number ");
        num= sc.nextInt();
        if(num==0){
            total=total+num;
        }
        else{
            total+=num;
        }
        }while(num!=0);
        System.out.print("Sum of number is = "+total);
        sc.close();
    }
}

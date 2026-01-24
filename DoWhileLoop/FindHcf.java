package DoWhileLoop;

import java.util.*;

class HcfNum{
    public int Find1 (int num ,int num2){
        int i=1;
        int HcfOfNumber=0;
        if(num>=num2){
            do{
                if(num%i==0 && num2%i==0){
                    HcfOfNumber=i;
                }
                i++;
            }while(num>=i);
        }else{
            do{
                if(num%i==0 && num2%i==0){
                    HcfOfNumber=i;
                }
            i++;
            }while(num2>=i);
        }
        return HcfOfNumber;
    }
}

public class FindHcf{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HcfNum obj=new HcfNum();
        System.out.println("Enter the number!..");
        int num=sc.nextInt();
        System.out.println("Enter the second Number!..");
        int num2=sc.nextInt();
        int result=obj.Find1(num,num2);
        System.err.println(" Hcf Of "+num+" And "+ num2+" = "+result);
        sc.close();
    }
}
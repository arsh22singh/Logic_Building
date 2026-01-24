package DoWhileLoop;
import java.util.*;

class PrintFibonicce{
    public void printNum(int num){
        int a=0;
        int b=1;
        int i=0;
        do{
            int c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
            i++;
        }while(num>i);
    }

}
public class PrintFiboserise{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        PrintFibonicce obj=new PrintFibonicce();
        System.out.print("Entter the number..!  ");
        int num=sc.nextInt();
        obj.printNum(num);
        sc.close();
    }
}
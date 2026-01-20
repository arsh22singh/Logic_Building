package DoWhileLoop;
import java.util.Scanner;
public class TablePrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1,num=0;
        System.out.printf("Enter The Number Which you want to print a table..");
        num=sc.nextInt();
        do{
            System.out.printf("%d * %d = %d \n",num,i,num*i);
            i++;
        }while(i<=10);
        sc.close();
    }
}

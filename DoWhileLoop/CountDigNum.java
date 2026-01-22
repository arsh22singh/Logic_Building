
/*Count and print the number of digits in the given number. */

package DoWhileLoop;
import java.util.*;

class count{
    public int numCount(Scanner sc){
        int num=0;
        System.out.println("Enter the Number: ");
        num=sc.nextInt();
        int count=0;

        do{
            int digs=0;
            digs=num%10;
            if(digs>0){
                count+=1;
            }
            num=num/10;
        }while(num>1);
        return count;
    }
}
public class CountDigNum {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    count x= new count();
    int dig=x.numCount(sc);
    System.err.println(dig);
    sc.close();
}
}
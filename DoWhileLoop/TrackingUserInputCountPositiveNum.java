package DoWhileLoop;
import java.util.*;

public class TrackingUserInputCountPositiveNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int count=0;
        do{
        System.out.println("Enter the number");
            num=sc.nextInt();
            if(num>=0){
                count=count+1;
            }
            }while(0<=num);
            System.err.println(" = "+count);
            sc.close();
    }
}

package DoWhileLoop;

import java.util.*;

class Findfact{
public void find(int num){
    int i=1;
    do{
        if(num%i==0){
            System.err.print(i+" ");
        }
    i++;
    }while(num>=i);
}
}
public class FindFactorial {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Findfact obj=new Findfact();
        System.out.println("Enter the Number...! ");
        int num=sc.nextInt();
        obj.find(num);
        sc.close();
    }
}

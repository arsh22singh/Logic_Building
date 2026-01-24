package DoWhileLoop;
import java.util.*;
public class ManudrivenOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chack=0;
        int num1,num2 ,result;
        do{
            System.out.println(":.. Enter 1 For sum Of  Two Num! ..:");
            System.out.println(":.. Enter 2 For Substraction Two Num! ..:");
            System.out.println(":.. Enter 3 For Multiply Two num! ..:");
            System.out.println(":.. Enter 4 For Divide the Num! ..:");
            System.out.println(":.. Enter 5 For Exit the operation! ..:");
            
            System.out.print("ENTER THE OPTION...! ");
            chack=sc.nextInt();

            switch (chack) {
                case 1:
                    System.out.println("..CHOOSE ADD OPTION..");
                    System.out.println("Enter ther First Num = ");
                    num1=sc.nextInt();
                    System.out.println("Enter ther Second Num = ");
                    num2=sc.nextInt();
                    result=num1+num2;
                    System.err.println("Sum of Two Number is ( " +num1+"+"+num2+")"+" = "+ result );
                    break;
                case 2:
                    System.out.println("..CHOOSE SUB OPTION..");
                    System.out.println("Enter ther First Num = ");
                    num1=sc.nextInt();
                    System.out.println("Enter ther Second Num = ");
                    num2=sc.nextInt();
                    result=num1-num2;
                    System.err.println("difference  of Two Number is ( " +num1+"-"+num2+")"+" = "+ result );
                    break;
                case 3:
                    System.out.println("..CHOOSE MULTIPLY OPTION..");
                    System.out.println("Enter ther First Num = ");
                    num1=sc.nextInt();
                    System.out.println("Enter ther Second Num = ");
                    num2=sc.nextInt();
                    result=num1*num2;
                    System.err.println("Sum of Two Number is ( " +num1+"*"+num2+")"+" = "+ result );
                    break;
                case 4:
                    System.out.println("..CHOOSE Divide OPTION..");
                    System.out.println("Enter ther First Num = ");
                    num1=sc.nextInt();
                    System.out.println("Enter ther Second Num = ");
                    num2=sc.nextInt();
                    if(num1==0 && num2==0){
                        System.err.println("Division not perfrom");
                    }else if (num1>num2){
                        result=num1/num2;
                        System.err.println("Sum of Two Number is ( " +num1+"+"+num2+")"+" = "+ result );
                    } else {
                        result=num2/num1;
                        System.err.println("Sum of Two Number is ( " +num1+"+"+num2+")"+" = "+ result );
                    }
                    break;
                    case 5:
                        System.out.println("Thank you ...");
                        break;
                default:
                    System.out.println("Please select 1 to 5 ");
                    break;
            }

        }while(chack !=5);
        sc.close();
    }
}

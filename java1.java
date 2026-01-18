    import java.util.Scanner;
    public class java1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt(); 
        int b= sc.nextInt();
        int n;
        if(a>b)
        n=a;
        else
        n=b;
        while(true) 
        {
            if(n%a==0 && n%b==0){
            System.err.println("LCM: "+n);
            break;
        }
        n++;
        }
    
    }
    }
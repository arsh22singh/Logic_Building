package DoWhileLoop;

import java.util.*;

class A {
    public static int cla(Scanner sc) {
        int total = 0;
        int num;
        do {
            num = sc.nextInt();
            if (num != 0) total += num;
        } while (num != 0);
        return total;
    }
}

public class KeepTrackingNumberAndPrintSumOFAllNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(A.cla(sc));
    }
}

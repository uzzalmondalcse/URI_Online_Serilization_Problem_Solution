package August_Intersting_Uri;

import java.util.Scanner;

public class URI_2_AreaOfCircle {
    public static void main(String[] args) {
        double r, n, a;
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        n = 3.14159;

        a = n * r * r;
        System.out.printf("A=%.4f\n",a);

    }
}

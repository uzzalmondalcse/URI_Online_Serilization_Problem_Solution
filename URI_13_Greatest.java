package August_Intersting_Uri;

import java.util.Scanner;
import java.lang.Math;

public class URI_13_Greatest {
    public static void main(String[] args) {
       int a, b, c, x;
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       b = sc.nextInt();
       c = sc.nextInt();
       x = (a + b + Math.abs(a - b))/2;
       x = (x + c + Math.abs(x - c))/2;
        System.out.printf("%d eh o maior\n",x);
    }
}

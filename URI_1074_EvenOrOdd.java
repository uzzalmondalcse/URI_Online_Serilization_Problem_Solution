package August_Intersting_Uri;

import java.util.Scanner;

public class URI_1074_EvenOrOdd {
    public static void main(String[] args) {
        int num, i, x;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for ( i = 0; i < num; i++) {
           x = sc.nextInt();
            if (x == 0) {
                System.out.println("NULL");
            }
            if (x > 0) {
                if (x % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            }
            if (x < 0) {
                if (x % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }

       // System.out.println(i);

       /* for (int i = 0; i <= num; i++) {
            if (i == 0) {
                System.out.println("NULL");
            }
            if (i > 0) {
                if (i % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            }
            if (i < 0) {
                if (i % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }*/


    }
}

package August_Intersting_Uri;

import java.util.Scanner;

public class URI_1070_ConsecutiveOdd {
    public static void main(String[] args) {

        int x, y, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            for (i = y ; i < x; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }

        if (x < y) {
            for (i = x ; i < y; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }

        System.out.println(sum);












       /* int x, y, sum = 0, i, temp, n;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        if (x < y) {
            for (i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                }
            }
        } else if (x > y) {
            for (i = y + 1; i < x; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                }
            }
        }
        System.out.println(sum);*/


    }
}

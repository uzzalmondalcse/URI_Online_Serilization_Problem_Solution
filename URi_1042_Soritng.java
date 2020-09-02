package August_Intersting_Uri;

import java.util.Scanner;

public class URi_1042_Soritng {
    public static void main(String[] args) {
        int a, b, c, temp, i, j, k;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        i = a;
        j = b;
        k = c;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a + "\n" + b + "\n" + c + "\n");
        System.out.println(i + "\n" + j + "\n" + k);

    }
}

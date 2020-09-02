package August_Intersting_Uri;

import java.util.Scanner;

public class URI_1060_PossitiveNum {
    public static void main(String[] args) {
        int n1, n2, n3, n6, count = 0;
        float n4, n5;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextFloat();
        n5 = sc.nextFloat();
        n6 = sc.nextInt();

        if (n1 > 0) {
            count++;
        }
        if (n2 > 0) {
            count++;
        }
        if (n3 > 0) {
            count++;
        }
        if (n4 > 0) {
            count++;
        }
        if (n5 > 0) {
            count++;
        }
        if (n6 > 0) {
            count++;
        }

        System.out.println(count + " valores positivos");
    }
}

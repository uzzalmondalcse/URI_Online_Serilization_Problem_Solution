package August_Intersting_Uri;

import java.util.Scanner;

public class URI_1064_PossitiveAndAvg {
    public static void main(String[] args) {
        float n1, n2, n3, n4, n5, n6, avg;
        double totalNum = 0.0, count = 0.0;
        Scanner sc = new Scanner(System.in);
        /*n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();
        n5 = sc.nextFloat();
        n6 = sc.nextFloat();*/

        for (int i = 0; i < 6; i++) {
            n1 = sc.nextFloat();
            if (n1 > 0) {
                count++;
                totalNum = totalNum + n1;
            }
        }
        avg = (float) (totalNum / count);
        System.out.printf("%.0f valores positivos\n", count);
        System.out.printf("%.1f\n", avg);


        /*if (n1 > 0) {
            count++;
            totalNum = totalNum + n1;

        }
        if (n2 > 0) {
            count++;
            totalNum = totalNum + n2;
        }
        if (n3 > 0) {
            count++;
            totalNum = totalNum + n3;
        }
        if (n4 > 0) {
            count++;
            totalNum = totalNum + n4;
        }
        if (n5 > 0) {
            count++;
            totalNum = totalNum + n5;
        }
        if (n6 > 0) {
            count++;
            totalNum = totalNum + n6;
        }
        System.out.printf("%.0f valores positivos\n", count);
        avg = (float) (totalNum / count);
        System.out.printf("%.1f\n", avg);*/


    }
}

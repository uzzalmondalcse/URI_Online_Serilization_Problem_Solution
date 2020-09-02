package August_Intersting_Uri;

import java.util.Scanner;

public class URI_6_Average2 {
    public static void main(String[] args) {
        float a, b, c, wa;
        int grade;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        grade = 2 + 3 + 5;
        wa = (a * 2 + b * 3 + c * 5) / grade;
        System.out.printf("MEDIA = %.1f\n" , wa);
    }
}

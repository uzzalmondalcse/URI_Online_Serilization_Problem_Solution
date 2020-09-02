package August_Intersting_Uri;

import java.util.Scanner;

public class URI_5_Average {
    public static void main(String[] args) {
        double x, y, a, b, weightGrade;
        a = 3.5;
        b = 7.5;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();

        weightGrade = (a * x + b * y) / (a + b);
        System.out.printf("MEDIA = %.5f\n",weightGrade);

    }
}

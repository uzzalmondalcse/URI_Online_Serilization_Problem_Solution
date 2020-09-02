package August_Intersting_Uri;

import java.util.Scanner;
import java.lang.Math;

public class URI_15_DistancePoints {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2));
        System.out.printf("%.4f\n",distance);



    }
}

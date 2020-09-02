package August_Intersting_Uri;

import java.util.Scanner;

public class URI_14_Consumption {
    public static void main(String[] args) {
        int x;
        float y, avg_per_letter;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextFloat();
        avg_per_letter = x / y;
        System.out.printf("%.3f km/l\n",avg_per_letter);
    }
}

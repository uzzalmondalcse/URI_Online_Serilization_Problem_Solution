package August_Intersting_Uri;

import java.util.Scanner;

public class Uri_1072_Interval2 {
    public static void main(String[] args) {
        int n, x, countIn = 0, countOut = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                countIn++;
            } else {
                countOut++;
            }

        }

        System.out.println(countIn + " in");
        System.out.println(countOut + " out");
    }
}

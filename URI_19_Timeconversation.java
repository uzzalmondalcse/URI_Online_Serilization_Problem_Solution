package August_Intersting_Uri;

import java.util.Scanner;

public class URI_19_Timeconversation {
    public static void main(String[] args) {
        int n, hour, min, sec;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        hour = n / 3600;
        min = n % 3600 / 60;
        sec = n % 60;
        System.out.printf("%d:%d:%d\n", hour, min, sec);


    }
}

package August_Intersting_Uri;

import java.util.Scanner;

public class URI_20_AgeInDays {
    public static void main(String[] args) {
        int n, year, month, days;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        year = n / 365;
        //System.out.println(year);
        days  = n % 365;
        //System.out.println(days);
        month = days / 30;
        //System.out.println(month);
        days = days % 30;
        //System.out.println(days);

        System.out.println(year+" ano(s)");
        System.out.println(month+" mes(es)");
        System.out.println(days+" dia(s)");

    }
}

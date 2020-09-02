package August_Intersting_Uri;

import java.util.Scanner;

public class URI_18_BankNotes {
    public static void main(String[] args) {
        int n;
        int hundred, fifty, twenty, ten, five, two , one;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(n);
        hundred = n / 100;
        System.out.println(hundred + " nota(s) de R$ 100,00");

        n = n % 100;
        //System.out.println(n);
        fifty = n / 50;
        System.out.println(fifty + " nota(s) de R$ 50,00");

        n = n % 50;
        //System.out.println(n);
        twenty = n / 20;
        System.out.println(twenty + " nota(s) de R$ 20,00");

        n = n % 20;
        //System.out.println(n);
        ten = n / 10;
        System.out.println(ten +" nota(s) de R$ 10,00");

        n = n % 10;
        //System.out.println(n);
        five = n / 5;
        System.out.println(five +" nota(s) de R$ 5,00");

        n = n % 5;
        //System.out.println(n);
        two = n / 2;
        System.out.println(two +" nota(s) de R$ 2,00");

        n = n % 2;
        //System.out.println(n);
        one = n / 1;
        System.out.println(one +" nota(s) de R$ 1,00");






    }
}

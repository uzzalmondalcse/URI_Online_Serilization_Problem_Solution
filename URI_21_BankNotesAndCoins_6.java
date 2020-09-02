package August_Intersting_Uri;

import java.util.Scanner;

public class URI_21_BankNotesAndCoins_6 {
    public static void main(String[] args) {
        double input;
        int n;
        int hundred, fifty, twenty, ten, five, two, a, b, c, d, e, f;
        Scanner sc = new Scanner(System.in);
        input = sc.nextDouble();
        n = (int) (input * 100);


        hundred = n / 10000;
        n = n % 10000;
        fifty = n / 5000;
        n = n % 5000;
        twenty = n / 2000;
        n = n % 2000;
        ten = n / 1000;
        n = n % 1000;
        five = n / 500;
        n = n % 500;
        two = n / 200;
        n = n % 200;

        a = n / 100;
        n = n % 100;
        b = n / 50;
        n = n % 50;
        c = n / 25;
        n = n % 25;
        d = n / 10;
        n = n % 10;
        e = n / 5;
        n = n % 5;
        f = n / 1;


        System.out.println("NOTAS:");
        System.out.println(hundred + " nota(s) de R$ 100.00");
        System.out.println(fifty + " nota(s) de R$ 50.00");
        System.out.println(twenty + " nota(s) de R$ 20.00");
        System.out.println(ten + " nota(s) de R$ 10.00");
        System.out.println(five + " nota(s) de R$ 5.00");
        System.out.println(two + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(a + " moeda(s) de R$ 1.00");
        System.out.println(b + " moeda(s) de R$ 0.50");
        System.out.println(c + " moeda(s) de R$ 0.25");
        System.out.println(d + " moeda(s) de R$ 0.10");
        System.out.println(e + " moeda(s) de R$ 0.05");
        System.out.println(f + " moeda(s) de R$ 0.01");


    }
}

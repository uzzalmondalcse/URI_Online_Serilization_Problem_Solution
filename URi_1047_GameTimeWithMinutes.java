package August_Intersting_Uri;

import java.util.Scanner;

public class URi_1047_GameTimeWithMinutes {
    public static void main(String[] args) {
        int a, c, b, d, e, dh, eRes;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        c = sc.nextInt();
        b = sc.nextInt();
        d = sc.nextInt();

        //todo: 60 min if i adding the num, after 1 hour subtract to hour..
        if (c > d) {
            d = (d + 60);
            e = d - c;

            if (a == b) {
                eRes = 24 + b - a;
                System.out.println("O JOGO DUROU " + eRes + " HORA(S) E " + e + " MINUTO(S)");
            } else if (a < b) {
                dh = b - a - 1; //todo:after 1 hour subtract to hour.
                System.out.println("O JOGO DUROU " + dh + " HORA(S) E " + e + " MINUTO(S)");
            } else if (a > b) {
                b = b + 24;
                dh = b - a - 1; //todo:after 1 hour subtract to hour.
                System.out.println("O JOGO DUROU " + dh + " HORA(S) E " + e + " MINUTO(S)");
            }

        } else {
            if (c < d)
                e = d - c;
            else
                e = 0;

            if (a == b) {
                eRes = 24 + b - a;
                System.out.println("O JOGO DUROU " + eRes + " HORA(S) E " + e + " MINUTO(S)");
            } else if (a < b) {
                dh = b - a; //todo:after 1 hour subtract to hour.
                System.out.println("O JOGO DUROU " + dh + " HORA(S) E " + e + " MINUTO(S)");
            } else if (a > b) {
                b = b + 24;
                dh = b - a; //todo:after 1 hour subtract to hour.
                System.out.println("O JOGO DUROU " + dh + " HORA(S) E " + e + " MINUTO(S)");
            }

        }


    }
}


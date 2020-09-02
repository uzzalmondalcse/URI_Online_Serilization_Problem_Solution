package August_Intersting_Uri;

import java.util.Scanner;

public class URi_1047_GameWithM {
    public static void main(String[] args) {

        int h1, m1, h2, m2, dt, h, m;
        Scanner sc = new Scanner(System.in);
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        h2 = sc.nextInt();
        m2 = sc.nextInt();

        dt = (h2 * 60 + m2) - (h1 * 60 + m1);

        if (dt <= 0) {
            dt = dt + 24 * 60;
        }

        h = dt / 60;
        m = dt % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h, m);


    }
}

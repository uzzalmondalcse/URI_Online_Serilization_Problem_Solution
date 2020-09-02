package August_Intersting_Uri;

import java.util.Scanner;

public class URi_1047_Game_Time_Min {
    public static void main(String[] args) {
        int ih, im, fh, fm, dm, dh;
        Scanner sc = new Scanner(System.in);
        ih = sc.nextInt();
        im = sc.nextInt();
        fh = sc.nextInt();
        fm = sc.nextInt();

        if (im > fm) {
            fm = fm + 60;
            dm = fm - im;

            if (ih == fh) {
                //dh = 24 + ih - fh;
                System.out.println("O JOGO DUROU HORA(S)  MINUTO(S)");
            }
        }

    }
}

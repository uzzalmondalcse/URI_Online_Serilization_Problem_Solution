package August_Intersting_Uri;

import java.util.Scanner;

public class URi_1046_GameTime {
    public static void main(String[] args) {
        int sTime, eTime, duration = 24, fDuration = 0;
        Scanner sc = new Scanner(System.in);
        sTime = sc.nextInt();
        eTime = sc.nextInt();

        if (sTime > eTime) {
            eTime = eTime + duration;
            fDuration = eTime - sTime;
            //fDuration = -sTime + eTime + duration;
            System.out.println("O JOGO DUROU " + fDuration + " HORA(S)");
        } else if (sTime == eTime) {
            fDuration = (eTime - sTime) + duration;
            System.out.println("O JOGO DUROU " + fDuration + " HORA(S)");
        } else if (sTime < eTime) {
            fDuration = eTime - sTime;
            System.out.println("O JOGO DUROU " + fDuration + " HORA(S)");
        }









       /* if (startTime > endTime) {
            endTime += duration;
            finalDuration = endTime - startTime;
            System.out.println("O JOGO DUROU " + finalDuration + " HORA(S)");
        } else if (startTime == endTime) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (endTime > startTime) {
            int r = endTime - startTime;
            System.out.println("O JOGO DUROU " + r + " HORA(S)");
        }*/

    }
}

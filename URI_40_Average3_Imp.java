package August_Intersting_Uri;

import java.util.Scanner;

public class URI_40_Average3_Imp {
    public static void main(String[] args) {
        float a, b, c, d, avg, f, recalAvg;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();

        avg = ((a * 2) + (b * 3) + (c * 4) + (d * 1)) / (2 + 3 + 4 + 1);
        System.out.printf("Media: %.1f\n", avg);

        if (avg >= 7.0) {
            System.out.println("Aluno aprovado.");

        } else if (avg < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (avg >= 5.0 && avg <= 6.9) {
            System.out.println("Aluno em exame.");
            f = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", f);
            recalAvg = (f + avg) / 2;

            if (recalAvg >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (recalAvg <= 4.9) {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", recalAvg);
        }


    }
}

package August_Intersting_Uri;

import java.util.Scanner;

public class URI_40_Average3 {
    public static void main(String[] args) {
        float a, b, c, d, avg, f;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();

        avg = ((a * 2) + (b * 3) + (c * 4) + (d * 1)) / (2 + 3 + 4 + 1);
        System.out.println(avg);

        if (avg >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (avg < 5.0) {
            System.out.println("Aluno Reprovado.");
        } else if (avg >= 5.0 && avg <= 6.9) {
            System.out.println("Aluno em exame.");
            f = sc.nextFloat();
            System.out.println("Nota do exame: " + f);
            avg = (f + avg) / 2;

            if (avg >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (avg <= 4.9) {
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: "+avg);
        }


    }
}

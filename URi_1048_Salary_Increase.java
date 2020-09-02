package August_Intersting_Uri;

import java.util.Scanner;

public class URi_1048_Salary_Increase {
    public static void main(String[] args) {

        float num, re = 0, ne = 0;
        int pe=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextFloat();

        if (num >= 0 && num <= 400.00) {
            re = (float) ((15 * num) / 100.00);
            ne = re + num;
            pe = 15;
           // System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", ne, re, pe);
        } else if (num >= 400.01 && num <= 800.00) {
            re = (float) ((12 * num) / 100.00);
            ne = re + num;
            pe = 12;
           // System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", ne, re, pe);

        } else if (num >= 800.01 && num <= 1200.00) {
            re = (float) ((10 * num) / 100.00);
            ne = re + num;
            pe = 10;
            //System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", ne, re, pe);

        } else if (num >= 1200.01 && num <= 2000.00) {
            re = (float) ((7 * num) / 100.00);
            ne = re + num;
            pe = 7;
            //System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", ne, re, pe);

        } else if (num >= 2000.01) {
            re = (float) ((4 * num) / 100.00);
            ne = re + num;
            pe = 4;
            //System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", ne, re, pe);

        }
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", ne, re, pe);

    }
}

package August_Intersting_Uri;

import java.util.Scanner;
import java.lang.Math;

public class URI_23_BashkarasFormula {
    public static void main(String[] args) {
        double a, b, c, root, r1, r2;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        root = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Impossivel calcular");
        }
        else if (root >= 0) {
            r1 = (- b + Math.sqrt(root)) / (2 * a);
            r2 = (- b - Math.sqrt(root)) / (2 * a);
            System.out.printf("R1 = %.5f\n",r1);
            System.out.printf("R2 = %.5f\n",r2);
        }else if(root < 0){
            System.out.println("Impossivel calcular");
        }
    }
}

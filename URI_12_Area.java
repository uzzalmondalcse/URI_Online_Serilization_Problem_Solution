package August_Intersting_Uri;

import java.util.Scanner;

public class URI_12_Area {
    public static void main(String[] args) {
        double a, b, c,  pi = 3.14159;
        double rec_area, tri_area, cir_area, trap_area, square_area;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        tri_area = 0.5 * a * c;
        cir_area = pi * c * c;
        trap_area = 0.5 * (a + b) * c;
        square_area = b * b;
        rec_area = a * b;

        System.out.printf("TRIANGULO: %.3f\n",tri_area);
        System.out.printf("CIRCULO: %.3f\n",cir_area);
        System.out.printf("TRAPEZIO: %.3f\n",trap_area);
        System.out.printf("QUADRADO: %.3f\n",square_area);
        System.out.printf("RETANGULO: %.3f\n",rec_area);

    }
}

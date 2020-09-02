package August_Intersting_Uri;

import java.util.Scanner;

public class URi_1043_Triangle {
    public static void main(String[] args) {
        float a, b, c, trapiArea, perimeter;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            perimeter = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimeter);
        } else {
            trapiArea = (float) ((0.5 * ((a + b) * c)));
            System.out.printf("Area = %.1f\n", trapiArea);
        }


    }
}

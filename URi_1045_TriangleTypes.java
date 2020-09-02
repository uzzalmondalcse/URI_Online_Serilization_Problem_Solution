package August_Intersting_Uri;

import java.util.Scanner;

public class URi_1045_TriangleTypes {
    public static void main(String[] args) {
        //three variables are input..
        double a, b, c, temp;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        //decreasing order  - 10, 9, 8, 7
        if (a < b) {     // a = 8 , b = 9 think.
            temp = a;  // 8
            a = b;     // 9
            b = temp;  // 8 => a = 9 , b = 8;
        }
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }


        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((a + b > c) || (a + c > b) || (b + c > a)) {
            if ((a * a == (b * b + c * c))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if ((a * a > (b * b + c * c))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((a * a < (b * b + c * c))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c && c == a) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((a == b && a != c) || (b == c && a != c)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }
}

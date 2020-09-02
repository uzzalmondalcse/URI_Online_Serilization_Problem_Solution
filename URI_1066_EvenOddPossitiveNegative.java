package August_Intersting_Uri;

import java.util.Scanner;

public class URI_1066_EvenOddPossitiveNegative {
    public static void main(String[] args) {
        int n, even = 0, odd = 0, pos = 0, neg = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            n = sc.nextInt();
            //even
            if (n % 2 == 0) {
                even++;
            }
            if (n % 2 != 0) {
                odd++;
            }
            if (n > 0) {
                pos++;
            }
            if (n < 0) {
                neg++;
            }
        }
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");


    }

}

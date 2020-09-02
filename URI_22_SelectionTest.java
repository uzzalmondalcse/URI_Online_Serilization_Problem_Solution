package August_Intersting_Uri;

import java.util.Scanner;

public class URI_22_SelectionTest {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0){
            System.out.println("Valores aceitos");
        } else{
            System.out.println("Valores nao aceitos");
        }
    }
}

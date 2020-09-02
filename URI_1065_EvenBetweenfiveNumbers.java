package August_Intersting_Uri;

import java.util.Scanner;

public class URI_1065_EvenBetweenfiveNumbers {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            n = sc.nextInt();
            if (n % 2 == 0) {
                count++;
            }
        }
        System.out.printf("%d valores pares\n", count);
    }
}

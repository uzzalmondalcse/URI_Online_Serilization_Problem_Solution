package August_Intersting_Uri;

import java.util.Scanner;

public class URI_1073_EvenSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^2" + " = " + i * i);
            }
        }


    }
}

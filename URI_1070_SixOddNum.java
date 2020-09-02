package August_Intersting_Uri;

import java.util.Scanner;

public class URI_1070_SixOddNum {
    public static void main(String[] args) {
        int x, count = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

       if (x % 2 == 0){
           x = x + 1;
       }
        for (int i = 0; i <= 5; i++){
            System.out.println(x);
            x = x + 2;
        }

    }
}

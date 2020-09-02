package August_Intersting_Uri;

import java.util.Scanner;

public class URI_38_Snack {
    public static void main(String[] args) {
        int x, y;
        double price = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();


        if (x == 1) {
            price =  y * 4.00;
           // System.out.printf("Total: R$ %.2f" , price);
        } else if (x == 2) {
            price  = y * 4.50;
            //System.out.printf("Total: R$ %.2f" , price);
        } else if (x == 3) {
            price  = y * 5.00;
            //System.out.printf("Total: R$ %.2f" , price);
        } else if (x == 4) {
            price = y * 2.00;
            //System.out.printf("Total: R$ %.2f" , price);
        } else if (x == 5) {
             price = y * 1.50;
        }
        System.out.printf("Total: R$ %.2f\n" , price);
    }
}

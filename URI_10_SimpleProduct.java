package August_Intersting_Uri;

import java.util.Scanner;

public class URI_10_SimpleProduct {
    public static void main(String[] args) {
        int product_one, units_one, product_two, units_two;
        double price_one, price_two, pay_amount;
        Scanner sc = new Scanner(System.in);
        product_one = sc.nextInt();
        units_one = sc.nextInt();
        price_one = sc.nextDouble();

        product_two = sc.nextInt();
        units_two = sc.nextInt();
        price_two = sc.nextDouble();

        pay_amount = (units_one * price_one) + (units_two *price_two);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",pay_amount);






    }
}

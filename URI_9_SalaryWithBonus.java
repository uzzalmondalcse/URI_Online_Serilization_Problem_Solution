package August_Intersting_Uri;

import java.util.Scanner;

public class URI_9_SalaryWithBonus {
    public static void main(String[] args) {
        String sellersName;
        double fixedSalary, salesMonth, finalSalary;
        Scanner sc = new Scanner(System.in);
        sellersName = sc.nextLine();
        fixedSalary = sc.nextDouble();
        salesMonth = sc.nextDouble();


        finalSalary = fixedSalary + (salesMonth * 15 / 100);
        System.out.printf("TOTAL = R$ %.2f\n", finalSalary);


    }
}

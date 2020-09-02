package August_Intersting_Uri;

import java.util.Scanner;

public class URI_8_Salary {
    public static void main(String[] args) {
        int empNum, workHours;
        float salary, totalSalary;
        Scanner sc = new Scanner(System.in);
        empNum = sc.nextInt();
        workHours = sc.nextInt();
        salary = sc.nextFloat();

        totalSalary = workHours * salary;

        System.out.println("NUMBER = "+empNum);
        System.out.printf("SALARY = U$ %.2f\n",totalSalary);


    }
}

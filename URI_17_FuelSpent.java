package August_Intersting_Uri;

import java.util.Scanner;

public class URI_17_FuelSpent {
    public static void main(String[] args) {
        int spentTime, avgSpeed, tripDistance;
        double fuelSpent;
        Scanner sc = new Scanner(System.in);
        spentTime = sc.nextInt();
        avgSpeed = sc.nextInt();

        tripDistance = spentTime * avgSpeed;
        fuelSpent = (double) tripDistance / 12;
        System.out.printf("%.3f\n",fuelSpent);


    }
}

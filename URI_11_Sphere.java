package August_Intersting_Uri;

import java.util.Scanner;

public class URI_11_Sphere {
    public static void main(String[] args) {
        double radius, volSphere, PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();

        volSphere = ((4/3.0) * PI * radius * radius * radius);
        System.out.printf("VOLUME = %.3f\n",volSphere);

    }
}

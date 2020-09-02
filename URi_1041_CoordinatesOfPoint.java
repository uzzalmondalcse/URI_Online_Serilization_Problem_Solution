package August_Intersting_Uri;

import java.util.Scanner;

public class URi_1041_CoordinatesOfPoint {
    public static void main(String[] args) {
        float x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        y = sc.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if ((y == 0) && (x > 0 || x < 0)) {
            System.out.println("Eixo X");
        } else if ((x == 0) && (y > 0 || y < 0)) {
            System.out.println("Eixo Y");
        }else if (x > 0 && y > 0){
            System.out.println("Q1");
        }else if (x < 0 && y > 0){
            System.out.println("Q2");
        }else if (x < 0 && y < 0){
            System.out.println("Q3");
        }else if (x > 0 && y < 0){
            System.out.println("Q4");
        }

    }
}

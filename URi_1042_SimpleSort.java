package August_Intersting_Uri;

import java.util.Arrays;
import java.util.Scanner;

public class URi_1042_SimpleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int []myArray = new int[3];
        int []tempArray = new int[3];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = sc.nextInt();
            tempArray[i] = myArray[i];
            System.out.println(myArray[i]);
        }


    }
}

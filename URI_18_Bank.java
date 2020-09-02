package August_Intersting_Uri;

import java.util.Scanner;

public class URI_18_Bank {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(n);
        int [] note = {100, 50, 20, 10, 5, 2, 1};
        int [] money = new int[7];

        for (int i = 0; i < note.length; i++){
            money[i] = n / note[i];
            n = n % money[i];
            System.out.println(note[i]);
        }
    }
}

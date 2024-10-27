package string;

import java.util.Scanner;

public class Num2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String star = "*";

        //9 7 5 3 1

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

    }
}

package loop;

import java.util.Scanner;

public class Num2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //처음부터 n번째 줄까지
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.println(" ");
            }
            for (int k = 0; k >= 0; k++) {
                System.out.println("*");
            }
        }

        //n번째 다음 줄부터 4줄
        for (int i = 1; i < n; i++) {

        }



    }
}




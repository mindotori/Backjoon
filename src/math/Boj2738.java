package math;

import java.util.Scanner;

public class Boj2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //행
        int m = sc.nextInt(); //열
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        //arr1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        //arr2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        //arr1 + arr2
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        //result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }
}

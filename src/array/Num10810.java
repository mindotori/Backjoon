package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Num10810 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n+1];

        for (int t = 0; t < m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int index = i; index <= j; index++){ //i부터 j까지(j포함)
                basket[index] = k; // k공 넣어야하므로
            }
        }
        for (int i = 1; i <= n; i++) {
            //1번 바구니부터 N번바구니 까지니까 i = 1로 설정.
            System.out.print(basket[i]+" ");
        }
    }
}

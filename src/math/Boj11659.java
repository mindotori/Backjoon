package math;

import java.util.Scanner;

public class Boj11659 {
    //누적합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefixSum = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i - 1];
        }

        for (int p = 0; p < m; p++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            //구간 합 계산
            System.out.println(prefixSum[j] - prefixSum[i - 1]);
        }

        sc.close();
    }

}

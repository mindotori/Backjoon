package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1); //이분 탐색을 위해 정렬
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();

        for (int i : arr2) {
            //lowerBound
            int left = 0, right = arr1.length;
            while (left<right){
                int mid = left + (right - left) / 2;
                if(arr1[mid] >= i){
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            int lowerBound = left;

            //upperBound
            left = 0;
            right = arr1.length;
            while (left<right){
                int mid = left + (right - left) / 2;
                if(arr1[mid] > i){
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            int upperBound = left;

            sb.append(upperBound - lowerBound).append(" ");
        }

        System.out.println(sb.toString());
    }
}

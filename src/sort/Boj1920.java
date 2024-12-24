package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1920 {
    //이분 검색
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        //정렬
        Arrays.sort(arr1);
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        //이진 검색
        StringBuilder sb = new StringBuilder();
        for (int i : arr2) {
            if(Arrays.binarySearch(arr1, i) >= 0){ //존재 여부 확인
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.println(sb);


    }
}

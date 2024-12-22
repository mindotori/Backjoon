package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Boj3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        outer:
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(sum - arr[i] - arr[j] == 100){
                    arr[i] = -1;
                    arr[j] = -1;
                    break outer;
                }
            }
        }
        Arrays.sort(arr);
        for (int i : arr) {
            if (i != -1){
                System.out.println(i);
            }
        }
    }
}

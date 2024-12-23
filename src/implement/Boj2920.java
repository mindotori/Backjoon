package implement;

import java.util.Scanner;

public class Boj2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) arr[i] = sc.nextInt();

        String result = "ascending";
        for (int i = 1; i < 8; i++) {
            if (arr[i] < arr[i - 1]) result = "descending";
            else if (arr[i] > arr[i - 1] && result.equals("descending")) {
                result = "mixed";
                break;
            }
        }

        System.out.println(result.equals("descending") && arr[0] < arr[7] ? "mixed" : result);
    }
}

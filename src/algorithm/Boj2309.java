package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Boj2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; //입력받은 난쟁이들 키 합산
        }

        // 두 명 제외해서 합 100 되도록
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
            if(i != -1){
                System.out.println(i);
            }
        }



    }
}

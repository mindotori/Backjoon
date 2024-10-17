package array;

import java.util.Arrays;
import java.util.Scanner;

public class Num10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            int x = sc.nextInt();
            arr[i] += x;
        }
        //System.out.println(Arrays.toString(arr));
        int min = arr[0], max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print(min + " " + max);
    }
}

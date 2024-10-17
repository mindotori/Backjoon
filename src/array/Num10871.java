package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num10871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int n2 = sc.nextInt();
            arr[i] += n2;
        }

        List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < x){
                arr2.add(arr[i]);
            }
        }
        //출력 폼을 맞춰야한다
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}

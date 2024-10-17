package array;

import java.util.Scanner;

public class Num2562 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            int n = sc.nextInt();
            arr[i] += n;
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int index = max;
        //인덱스 값 뽑기
        for (int i = 0; i < arr.length; i++) {
            //arr[i]값이 max와 같다면
            if (arr[i]==max){
                index = i+1;
                break;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}

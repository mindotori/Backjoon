package array;

import java.util.Scanner;

public class Num10807 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int n2 = sc.nextInt();
            arr[i] += n2;
        }
        int n3 = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(n3==arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}

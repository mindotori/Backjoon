package condition;

import java.util.Arrays;
import java.util.Scanner;

public class Num20053 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        int[] answer = new int[2];

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] nums = new int[n];

            for (int j = 0; j < n; j++) {
                nums[j] = sc.nextInt();
                answer[0] = nums[0];

                if (answer[0]>nums[j]){

                    answer[0] = nums[j];
                }
                if(answer[0]<nums[j]){
                    answer[1] = nums[j];
                }
            }
            System.out.println(Arrays.toString(answer));
        }
    }
}

package sort;

import java.util.Scanner;

public class Boj2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //입력값 범위: -4000 ~ 4000 [8001]
        int[] arr = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //중간값과 최빈값은 -4000~4000 을 제외한 수로 초기화
        int median = 10000;
        int mode = 10000;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            sum += value;
            arr[value + 4000]++;

            if(max < value){
                max = value;
            }
            if(min > value){
                min = value;
            }
        }

        //순회
        int count = 0; //중앙값 빈도 누적 수
        int mode_max = 0; //최빈값의 최댓값

        // 이전의 동일한 최빈값이 1번만 등장한 경우 true / 아닌 경우 false
        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000 ; i++) {//인덱스 음수 방지

            if(arr[i] > 0){
                //중앙값 찾기
                if (count < (n+1) / 2){
                    count += arr[i];
                    median = i - 4000;
                }
                // 최빈값 찾기
                //이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
                if(mode_max < arr[i]){
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true; //첫 등장이므로 true
                }
                //이전 최빈값 최대값과 동일한 경우이면서 한 번만 중복되는 경우
                else if(mode_max == arr[i] && flag == true){
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        System.out.println((int) Math.round((double) sum / n));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
    }
}

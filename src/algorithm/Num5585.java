package algorithm;

import java.util.Scanner;
//그리디 알고리즘
public class Num5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //물건 가격
        int count = 0;
        int remain = 1000 - n; //잔돈
        int coins[] = {500, 100, 50, 10, 5, 1};


        for (int i = 0; i < coins.length; i++) {
            int tmp = remain / coins[i]; //해당 동전 거슬러 줄 개수
            remain %= coins[i]; //남은 돈 갱신
            count += tmp; // 최소 동전 개수를 카운트
        }
        System.out.println(count);
    }
}

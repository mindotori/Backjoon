package string.condition;

import java.util.Scanner;

public class ThreeDice2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 3개
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int money = 0;

        if(a==b&&b==c){ //같은 눈 3개
            money = 10000 + (a*1000);
        } else if(a==b||a==c||b==c){ // 같은 눈 2개
            if(a==b||a==c){
                money = 1000 + (a*100);
            } else{
                money = 1000 + (b*100);
            }

        } else { //모두 다른 눈
            int max = Math.max(a, Math.max(b,c)); //셋 중 가장 큰 눈 구하기
            money = max * 100;
        }
        System.out.println(money);
    }
}

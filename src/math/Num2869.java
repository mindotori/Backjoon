package math;

import java.util.Scanner;

//<A, B, V>
//막대의 길이 V
//
//하루에 a-b 미터 올라감
//* 마지막 날에는 b미터 미끄러지기 전에 정상 오름 (계산 제외)
//
//        (v - a) / (a - b)

public class Num2869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        // v-b : 마지막 날 미끄러지지 않음 (정상까지 남은 거리)
        // a-b : 하루에 올라가는 순 이득

        int day = (v-b)/(a-b);
        // 나머지가 있으면 하루 추가
        if ((v-b) % (a-b) != 0){
            day++;
        }

        System.out.println(day);


    }
}







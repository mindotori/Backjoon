package math;

import java.util.Scanner;

public class Num2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //45분 일찍 알람
        int h = sc.nextInt(); //0~23
        int m = sc.nextInt(); //0~59

        // 23 59

        if(m<45){ //45분 미만
            m = m + 60 - 45; // 60분을 더한 뒤 45분을 빼면 45분 전의 시간으로 계산
            h--; //hour - 1시간
            if(h < 0){ // 시간이 음수인 경우 23으로 변경
                h = 23;
            }
        } else {
            m = m - 45; // 45분을 뺀 결과
        }

        System.out.println(h + " " + m);

    }
}

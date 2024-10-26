package math;

import java.util.List;
import java.util.Scanner;

public class Num1924 {
//모듈러 연산
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] month = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int m = sc.nextInt();
        int d = sc.nextInt();

        int totalDays = d; //입력된 일수를 totalDays에 먼저 저장

        for (int i = 0; i < m-1; i++) {
            totalDays += month[i];
        }

        String day = week[totalDays % 7]; //모듈러 연산
        System.out.println(day);





    }
}

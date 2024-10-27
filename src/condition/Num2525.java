package condition;

import java.util.Scanner;

public class Num2525 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int totalM = 0;

        totalM = h * 60 + m + p;

        h = (totalM / 60) % 24 ; //시간을 24로 나눈 나머지
        m = totalM % 60; // 남은 분 구하기



        System.out.println(h + " " + m);



    }
}

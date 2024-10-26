package math;

import java.util.Scanner;

public class Num2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dot = 2; //초기 상태: 2

        for (int i = 0; i < n; i++) {
            dot += (dot - 1);
        }
        System.out.println(dot * dot);


    }
}


/*
초기 점 4개
사각형 하나 생길때 5개 점 추가 생성

변에 있는 점 개수^2 =  전체 점의 개수

n번 시행: (n-1번째 시행값) + (n - 1번째 시행값 - 1)
초기 상태: 2
1번 시행: 2 + 1 = 3
2번 시행: 3(2+1) + 2(3-1) = 5
3번 시행: 5 + 4 = 9
*/



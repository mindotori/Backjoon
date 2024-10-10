package string;

import java.util.Scanner;

public class SumOfNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //자릿수 N
        int n1 = sc.nextInt();
        //둘째 줄 숫자 N개
        //둘째 줄에 숫자 N개가 공백없이 주어진다. => next() 사용
        String n2 = sc.next();
        //합계 선언
        int sum = 0;

        for (int i = 0; i < n1; i++) {
            // 문자를 실제 숫자로 변환하기 위해 **아스키 코드에서 '0'**을 뺌
            // 아스킼 코드 상 '0'은 48에 해당
            sum += n2.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}

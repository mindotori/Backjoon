package math;

import java.util.Scanner;

public class Num11653 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사용자로부터 숫자 입력받기

        if(n > 1) { // n이 1 이하일 경우 소인수 분해가 의미 없으므로 아무 것도 출력하지 않음
            // 2부터 n의 제곱근까지 반복하며 소인수 찾기
            for (int i = 2; i <= Math.sqrt(n); i++) {
                while (n % i == 0) { // i로 나누어 떨어지면
                    System.out.println(i); // i를 출력
                    n = n / i; // n을 i로 나눈 값으로 갱신
                }
            }
        }

        if (n > 1) { // 남은 n이 1보다 크면 그것이 마지막 소인수
            System.out.println(n);
        }
    }
}

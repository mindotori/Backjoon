package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num2581 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        // M부터 N까지 소수를 찾기
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        // 리스트가 비어 있는 경우 처리
        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            // 소수의 합과 최소값 계산
            int sum = 0;
            int min = list.get(0); // 리스트의 첫 번째 원소로 초기화

            for (int num : list) { // for-each로 각 원소를 순회
                sum += num;        // 합계 계산
                min = Math.min(min, num); // 최솟값 갱신
            }

            System.out.println(sum); // 합 출력
            System.out.println(min); // 최솟값 출력
        }
    }

    // 소수 판별 메서드
    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false; // 1 이하의 숫자는 소수가 아님
        }

        // 2부터 x의 제곱근까지 나누어 떨어지는지 확인
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
        }
        return true; // 나누어 떨어지지 않으면 소수
    }
}

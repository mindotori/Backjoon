package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//브루트 포스
public class Boj2798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
        }

        int result = serach(list, n, m);
        System.out.println(result);
    }

    static int serach(List<Integer> list, int n, int m) {
        int result = 0; // 가장 큰 값을 저장할 변수 (초기값은 0)

        // i, j, k는 각각 3개의 카드를 선택하는 인덱스
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 3개의 카드를 선택하여 그 합을 계산
                    int temp = list.get(i) + list.get(j) + list.get(k);

                    // 만약 합이 m과 같으면 바로 그 값을 반환
                    if (m == temp) {
                        return temp;
                    }

                    // 합이 m보다 작고, 현재 result보다 큰 값이면 result를 갱신
                    if (result < temp && temp < m) {
                        result = temp;
                    }
                }
            }
        }
        // 반복문을 다 돌고 난 후, 가장 큰 값을 반환
        return result;
    }
}

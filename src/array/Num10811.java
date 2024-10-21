package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Num10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        for (int t  = 0; t < m; t++) {
            int i = sc.nextInt() - 1; // 인덱스는 0부터 시작이니까 -1
            int j = sc.nextInt() - 1;

            //부분 리스트 뒤집기 (i부터 j까지 반복)
           while (i<j){
               int temp = list.get(i); // i인덱스 값을 temp에 임시 저장
               list.set(i, list.get(j)); // j 인덱스 값을 i번째로 이동
               list.set(j, temp); // 임시 저장 값을 j번째로 이동

               //i는 증가하고, j는 감소하여 중앙으로 이동시킴
               i++;
               j--;
           }
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }

    }

}

// n: 바구니 개수 / m:
//         i번째부터 j번째 바구니 순서를 역순으로 (뒤집기)
//1 2 3 4 5 (오리지날)
//2 1 3 4 5 (1트)
//2 1 4 3 5 (2트)
//3 4 1 2 5 (3트)
//3 4 1 2 5 (4트)

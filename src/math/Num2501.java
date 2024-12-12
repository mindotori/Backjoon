package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num2501 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                list.add(i);
            }
        }

        //n의 약수의 개수가 k보다 적을 경우 0 출력해야함
        if (list.size()<k){
            System.out.println(0);
        } else {
            //오름차순 정렬에서 k번째로 작은 수를 구하면 그냥 인덱스 k-1
            System.out.println(list.get(k-1));
        }
    }
}

package stack;

import java.util.*;

public class Num10773 {
    // 동적 배열은 크기 .size()로
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        //입력값을 처음부터 다 받으려고 했는데 그러면 안됨
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();

            if(n==0){
                //n이 0이면 제일 최근 요소 제거 (배열 마지막 인덱스)
                arr.remove(arr.size()-1);
            } else {
                arr.add(n); //0이 아니면 추가
            }
        }
        int sum = 0;
        for (int i : arr) {
            sum +=  i;
        }
        System.out.println(sum);
    }
}

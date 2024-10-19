package array;

import java.util.Scanner;

public class Num10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력1
        int n = sc.nextInt();
        int m = sc.nextInt(); //m번 공을 바꿈
        int[] basket = new int[n];
        //바구니에 1,2,3,4,5 공 넣기
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i+1;
        }
        //여기까지 1,2,3,4,5-------------
        for (int t = 0; t < m; t++) {
            //배열 인덱스는 0인데 입력값은 1부터니까 -1 해주기
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            //i번 바구니와 j번 바구니에 들어있는 공을 교환

                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}


//<바구니 1,2,3,4,5>
//공    1,2,3,4,5 (1트) - 교환x 상태
//공    2,1,3,4,5 (2트)
//공    2,1,4,3,5 (3트)
//공    3,1,4,2,5


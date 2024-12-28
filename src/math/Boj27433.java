package math;

import java.util.Scanner;

public class Boj27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long answer = 1; //결과가 커질 수 있으므로 long 사용

        if(n == 0){
            answer = 1; // 0! = 1
        } else {
            for (int i = n; i > 0; i--) {
                answer *= i;
            }
        }
        System.out.println(answer);
    }
}

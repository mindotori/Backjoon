package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num1978 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (isPrime(x)){
                count++;
            }
        }
        System.out.println(count);
    }

    //소수인지 확인하는 메서드
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 가장 작은 소수는 2
        }

        //2부터 n의 제곱근까지 반복하여 나누어 떨어지는지 체크
        for (int i = 2; i * i <= n ; i++) {
            if(n % i == 0){
                return false; // 나누어 떨어지면 소수가 아님
            }
        }
        return true; //나누어 떨어지지 않으면 소수

    }
}

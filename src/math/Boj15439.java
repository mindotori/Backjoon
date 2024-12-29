package math;

import java.util.Scanner;

public class Boj15439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //상하의
        int result = n * (n-1); //상하의 다른 색상 조합 수
        System.out.println(result);
    }
}

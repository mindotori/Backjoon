package implement;

import java.util.Scanner;

public class Boj2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int abc = a * b * c;
        String n = String.valueOf(abc); //곱한 값 문자열로 변환

        int[] answer = new int[10]; //0~9의 개수 저장할 배열 생성

        for (int i = 0; i < n.length(); i++) {
            int count = n.charAt(i) - '0'; //문자 '0' 빼서 정수로 변환
            answer[count]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(answer[i]);
        }
    }
}

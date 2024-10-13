package string;

import java.util.Scanner;

public class String9086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); //입력 버퍼 정리

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String answer = "";

            if (str.length() == 1){ //문자열 길이가 1인 경우
                answer = str + str;
            } else{
                answer = str.charAt(0) + "" + str.charAt(str.length() - 1);
            }
            System.out.println(answer);
        }
    }
}

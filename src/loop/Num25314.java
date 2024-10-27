package loop;

import java.util.Scanner;

public class Num25314 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //n의 개수 / 4 만큼 "long"을 출력하고 뒤에 "int" 출력
        String str = "long";

        System.out.println((str + " ").repeat(n/4).trim()+ " int");
        // 반복마다 공백 있어야 하니까 str + " "해주고 반복 돌리자
        // trim()으로 앞 뒤 공백만 제거
    }
}

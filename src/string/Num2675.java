package string;

import java.util.Scanner;

public class Num2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next(); //nextLine()쓰면 에러

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(s.charAt(j)); //여기 println 하면 안된다,,
                }
            }
            System.out.println(); //각 케이스 별로 한 줄로 입력
        }


    }
}

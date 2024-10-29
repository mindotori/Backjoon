package loop;

import java.util.Scanner;

public class Num2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String e = " ";
        String star = "*";

        for (int i = 1; i <= n; i++) {
            System.out.println(e.repeat(n-i) + star.repeat(i));
        }
    }
}

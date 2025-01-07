package string;

import java.util.Scanner;

public class Boj11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int m = n.length();

        for (int i = 0; i < m; i++) {
            System.out.print(n.charAt(i));

            if((i+1) % 10 == 0){
                System.out.println();
            }
        }
        sc.close();
    }
}

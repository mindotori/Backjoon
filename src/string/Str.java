package string;

import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = sc.nextInt();
        for (int j = 1; j <= str.length() ; j++) {
            if(j==i){
                System.out.println(str.charAt(i-1));
            }
        }
    }
}

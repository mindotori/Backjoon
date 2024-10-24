package string;

import java.util.Scanner;

public class Num10988 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if(str.equals(sb.toString())){ //StringBuilder와 String 비교 불가(.toString 해주기)
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

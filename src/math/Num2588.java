package math;

import java.util.Scanner;

public class Num2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

//        System.out.println(a*);

        System.out.println(a*(b%10));
        System.out.println(a*(((b-b%10)/10)%10));
        System.out.println(a*((b-b%100)/100));
        System.out.println(a*b);



    }
}

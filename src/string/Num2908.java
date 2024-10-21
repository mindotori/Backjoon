package string;

import java.util.Scanner;

public class Num2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = Integer.toString(sc.nextInt());
        String n2 = Integer.toString(sc.nextInt());

        //()안에 저장할 값 추가함
        StringBuilder reversed1 = new StringBuilder(n1);
        StringBuilder reversed2 = new StringBuilder(n2);

         reversed1.reverse();
         reversed2.reverse();

         //StringBuilder 직접 넘기진 못하고 toString()으로 문자열로 변환
         int reversedInteger1 = Integer.parseInt(reversed1.toString());
         int reversedInteger2 = Integer.parseInt(reversed2.toString());

         if(reversedInteger1 > reversedInteger2){
             System.out.println(reversedInteger1);
         } else {
             System.out.println(reversedInteger2);
         }





    }
}

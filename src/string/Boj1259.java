package string;

import java.util.Scanner;

public class Boj1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
           String n = sc.next(); //문자열 입력받기
            if(n.equals("0")){
                break;
            }

            boolean isP = true; //팰린드롬 여부 저장

            for (int i = 0; i < n.length(); i++) {
                if(n.charAt(i) != n.charAt(n.length() - 1 - i)){
                    isP = false;
                    break;
                }
            }

            //결과 출력
            if(isP){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }

        }
    }
}

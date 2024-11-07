package string;

import java.util.Scanner;

public class Num11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){ //문자열 입력 있는지 확인 - 있을 때 까지만 반복
            String s = sc.nextLine(); //한 줄 통째로 받아야한다. 공백에 넘어가면 안됨.
            System.out.println(s);
        }
        sc.close();
    }
}

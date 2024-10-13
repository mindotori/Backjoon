package string;

import java.util.Scanner;

public class Ascil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //문자 입력 받기
        char input = sc.nextLine().charAt(0);

        //아스키 코드 출력
        int num = (int)input; //char를 int로 형변환해서 아스키코드 뽑기

        System.out.println(num);
    }
}

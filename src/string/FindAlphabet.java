package string;

import java.util.Scanner;

public class FindAlphabet {
    //출력: a~z 한 칸의 공백으로 숫자 하나씩 출력해야함
    // 근데 입력 알파벳 인덱스 순서로 출력에 담겨야함
    // 단어가 없으면 -1 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 's', 't','u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < alphabets.length; i++) {
            if(str.charAt(i) == alphabets[i]){

            }
        }

    }
}

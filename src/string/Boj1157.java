package string;

import java.util.Scanner;

public class Boj1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toUpperCase();
        int[] alp = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alp[s.charAt(i) - 'A']++; //'A'를 빼서 0~25 인덱스 매핑
        }

        int maxCount = 0;
        char maxChar = '?';

        for (int i = 0; i < 26; i++) {
            if(alp[i] > maxCount){
                maxCount = alp[i];
                maxChar = (char) (i + 'A'); //인덱스 다시 알파벳으로 변환
            } else if(alp[i] == maxCount){
                maxChar = '?'; // 최댓값 중복
            }
        }

        System.out.println(maxChar);
    }
}

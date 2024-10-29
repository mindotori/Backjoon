package string;

import java.util.Scanner;

public class Num10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //배열 생성 후 모두 -1로 초기화
        int[] arr = new int[26]; // 총 알파벳 개수: 26개
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //ch의 문자의 위치를 arr 배열의 값으로 바꿔준다
            //(a는 10진수로 97 이라는 값에 대응)

            if(arr[ch - 'a'] == -1) { //arr 원소 값이 -1인 경우에만 초기화(초기에 -1설정 해둔게 그대로면 이미 수정했던 동일값일리가 없으므로)
                arr[ch - 'a'] = i; //아스키코드 인덱스 값에 i(순서)를 넣는거
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }


    }
}

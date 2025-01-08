package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        //이름 길이 모두 같다
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int length = arr[0].length();
        for (int i = 0; i < length; i++) {
            char c = arr[0].charAt(i);
            boolean isSame = true;

            //다른 파일과 같은 위치의 문자를 비교
            for (int j = 0; j < n; j++) {
                if(arr[j].charAt(i) != c){
                    isSame = false;
                    break;
                }
            }

            //동일하면 문자 유지하고 다르면 '?' 추가해야댐
            if(isSame){
                sb.append(c);
            } else {
                sb.append('?');
            }
        }
        System.out.println(sb);
    }
}

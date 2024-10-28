package loop;


import java.io.*;
import java.util.StringTokenizer;

public class Num15552 {

    public static void main(String[] args) throws IOException {
        //입력 (Scanner 대신)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 (System.out.println 대신)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 개수 = T
        int t = Integer.parseInt(br.readLine());
        //=> br은 String만 받으므로 형변환 해줌

        for (int i = 0; i < t; i++) {
            //a와 b입력 받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            //구분자를 기준으로 문자열 잘라냄
            //구분자가 없으면 공백을 기준으로 자른다 (여기서 이 상황)
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //a + b 결과 출력
            int sum = a + b;
            //.write()에는 문자열을 전달해야 하는데 sum은 int니깐 문자열로 형변환
            bw.write(Integer.toString(sum));
            bw.newLine();
        }
        // BufferedWriter를 플러시하고 닫기
        bw.flush();
        bw.close();

        // BufferedReader 닫기
        br.close();
    }
}

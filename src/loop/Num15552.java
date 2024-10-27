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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //a + b 결과 출력
            int sum = a + b;
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

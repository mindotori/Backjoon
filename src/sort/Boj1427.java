package sort;

import java.io.*;
import java.util.*;

public class Boj1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n.length(); i++) {
            list.add(n.charAt(i) - '0');
        }

        Collections.sort(list, Collections.reverseOrder());


        for (Integer i : list) {
            bw.write(String.valueOf(i));
            //bw는 문자열/문자만 처리 가능 : 숫자 -> 문자열로 변환
        }

        bw.flush();
        bw.close();
    }
}

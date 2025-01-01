package string;

import java.io.*;

public class Boj10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15]; //5행 (최대)15열
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();
            if (max < str.length()) {
                max = str.length();
            }

            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i] == '\0') {
                    continue;
                }
                sb.append(arr[j][i]);

            }
        }

        System.out.println(sb);


    }
}

package sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Boj2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //정렬
        Arrays.sort(arr);


        //중복 제거 및 출력 준비
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(i == 0 || arr[i] != arr[i-1]){
                sb.append(arr[i]).append('\n');
            }
        }

        bw.write(sb.toString()); // StringBuilder의 내용을 String으로 변환하여 출력 스트림에 기록
        bw.flush(); // 내부 버퍼에 쌓인 모든 데이터를 즉시 출력
        bw.close(); // BufferedWriter 종료하고 자원 해제
    }
}

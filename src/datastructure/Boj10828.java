package datastructure;

import java.io.*;
import java.util.Stack;

public class Boj10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine(); //입력 스트링으로

            if(input.startsWith("push")){
                //push
                int val = Integer.parseInt(input.split(" ")[1]);
                stack.push(val);
            } else if (input.equals("pop")){
                //pop
                if(stack.isEmpty()){ //비어있으면 오류나니 확인
                    bw.write("-1\n"); //비어있으면 -1
                } else {
                    bw.write(stack.pop()+"\n");
                }
            } else if (input.equals("size")) {
                //size
                bw.write(stack.size() + "\n");
            } else if (input.equals("empty")){
                //empty
                if(stack.isEmpty()){
                    bw.write("1\n");
                } else{
                    bw.write("0\n");
                }
            } else if (input.equals("top")) {
                //top
                if(stack.isEmpty()){
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }

        bw.flush(); //버퍼에 쌓인 것들 출력
        bw.close(); //자원 해제
    }
}

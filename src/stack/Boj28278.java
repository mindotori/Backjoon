package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("1")){
                stack.push(Integer.parseInt(st.nextToken()));
            } else if(command.equals("2")){
                if (!stack.isEmpty()){
                    sb.append(stack.lastElement()).append("\n");
                    stack.pop();
                } else sb.append(-1).append("\n");
            } else if (command.equals("3")) {
                sb.append(stack.size()).append("\n");
            } else if (command.equals("4")) {
                if (stack.isEmpty()){
                    sb.append(1).append("\n");
                }else {
                    sb.append(0).append("\n");
                }
            } else if (command.equals("5")) {
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.lastElement()).append("\n");
                }
            }
        }
        br.close();
        System.out.println(sb);

    }
}

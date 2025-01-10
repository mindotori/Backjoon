package stack;

import java.util.Scanner;
import java.util.Stack;

public class Boj9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(solve(sc.next()));
        }
    }

    public static String solve(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            //여는 괄호일 경우 스택에 넣기
            if(c == '('){
                stack.push(c);
            }

            // 이하: 닫는 괄호일 경우

            // stack이 비어있는 경우 (닫는 괄호를 입력받았으나 pop할 원소 없는 경우)
            else if(stack.empty()){
                return "NO";
            }
            //그 외 경우 stack 원소 pop
            else{
                stack.pop();
            }
        }
        //모든 검사 후 스택에 잔여 요소가 있으면 여는 괄호가 더 많으면 No
        //스택이 비어있으면 온전한 수식 YES
        if (stack.empty()) {
            return "YES";
        } else{
            return "NO";
        }
    }
}

package string;

import java.util.Scanner;

public class Num2941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //크로아티아 알파벳 배열
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String str = sc.nextLine();
        for (String s : arr) {
            if(str.contains(s)){ //str이 s를 포함하고 있다면 참
                str = str.replace(s,"*");
                // 크로아티아 알파벳이 포함되어 있다면 *로 대체
            }
        }
        System.out.println(str.length());
    }



}

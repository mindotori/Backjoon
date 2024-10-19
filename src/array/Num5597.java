package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Num5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //전체 학생
        int[] students = new int[30];

        //30명 중에 출석한 28명 번호 1로 표시
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            students[num-1] = 1; //번호는 1부터고 인덱스는 0부터이므로
        }

        //1이 아니면(출석하지 않은 사람) 찾기
        for (int i = 0; i < students.length; i++) {
            if(students[i] != 1){
                System.out.println(i+1);
            }
        }

    }
}

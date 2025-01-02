package math;

import java.util.Scanner;

public class Boj2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        //데이터 입력
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //최댓값 및 위치 초기화
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
               if(arr[i][j] > max){ //현재 위치 값이 max보다 크면 갱신
                   max = arr[i][j];
                   row = i + 1; //문제는 1행 / 1열부터 시작 = 1 + 인덱스
                   col = j + 1;
               }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);
    }
}

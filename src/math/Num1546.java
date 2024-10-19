package math;

import java.util.Arrays;
import java.util.Scanner;
//조건에 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다. 를 만족하려면 double로 반환
public class Num1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        double[] scores = new double[n1];
        for (int i = 0; i < n1; i++) {
            scores[i] = sc.nextInt();
        }
        double max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(max<scores[i]){
                max = scores[i]; //최댓값
            }
        }
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i] / (double) max * 100;
        }
        double answer = 0;
        for (int i = 0; i < scores.length; i++) {
             answer += scores[i];
        }
        answer = answer / scores.length;
        System.out.println(answer);

    }
}

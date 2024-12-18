package algorithm;

import java.util.Scanner;

public class Boj2839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k1 = 3;
        int k2 = 5;
        int cnt = 0; //봉지 개수

        while (true){
            if (n % k2 == 0){ //5로 나눌 수 있는 경우
                cnt += n / k2; // 5로 나눈 몫 카운트++
                System.out.println(cnt);
                break; // 5로만 나누어 떨어지는 경우
            } else if(n >= k1){ //5로 나눠지지 않고 3을 뺄 수 있는 경우
                n -= k1;  //3 한번 빼기
                cnt++; //봉지 개수 증가
            } else { // 더 이상 3 or 5로 안나눠지는 경우
                System.out.println(-1); //3,5로도 다 안나눠지면 -1 반환
                break;
            }
        }
    }
}

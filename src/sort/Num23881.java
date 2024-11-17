package sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num23881 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st1.nextToken());
        int exchange = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        selection_sort(arr, exchange);
    }

    public static void selection_sort(int[] arr, int exchange){
        int cnt = 0; //카운트

        //arr.length - 1은 배열의 마지막 인덱스를 가리킨다
        for (int i = arr.length - 1 ; i > 0 ; i--) {
            int maxIdx = i;

            for (int j = i-1; j >= 0 ; j--) {
                if(arr[j] > arr[maxIdx]){
                    maxIdx = j;
                }
            }
            // 최댓값을 현재 위치와 교환
            if (maxIdx != i){
                int tmp = arr[maxIdx];
                arr[maxIdx] = arr[i];
                arr[i] = tmp;
                cnt++; //교환 횟수 증가

                //교환 횟수가 주어진 횟수와 같으면 출력
                if(cnt == exchange){
                    System.out.println(arr[maxIdx] + " " + arr[i]);
                    return;
                }
            }
        }
        //교환 횟수가 주어진 횟수보다 적으면 -1 출력
        if(cnt < exchange) {
            System.out.println(-1);
        }
    }




}

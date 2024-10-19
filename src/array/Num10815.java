package array;

import java.util.*;

public class Num10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
//            int n2 = sc.nextInt();
//            arr1[i] += n2;
            arr1[i] = sc.nextInt();
        }
        int n3 = sc.nextInt();
        int[] arr2 = new int[n3];
        for (int i = 0; i < n3; i++) {
//            int n4 = sc.nextInt();
//            arr2[i] += n4;
            arr2[i] = sc.nextInt()
        }

        //출력값 담을 배열
        List<Integer> answer = new ArrayList<>();

        //arr1이 arr2에 있는지 확인
        for (int i = 0; i < arr2.length; i++) {
            boolean isIn = false;
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[j]==arr2[i]){
                    isIn = true; //포함되면 true
                    break;
                }
            }

            //포함 1 , 없으면 0
            if(isIn){
                answer.add(1);
            } else{
                answer.add(0);
            }
        }

        for (Integer i : answer) {
            System.out.print(i + " ");
        }
    }
}

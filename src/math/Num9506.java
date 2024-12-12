package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num9506 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int n = sc.nextInt();

            if(n == -1) {
                break;
            }

            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if(n % i == 0){
                    list.add(i);
                }
            }

            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            if (n==sum){ //여기 출력이 좀 빡셋음
                System.out.print(n + " = ");
                for (int i = 0; i < list.size(); i++) {
                    if(i > 0) {
                        System.out.print(" + ");
                    }
                    System.out.print(list.get(i));
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
        sc.close();
    }
}

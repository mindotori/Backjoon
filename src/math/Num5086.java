package math;

import java.util.Scanner;

public class Num5086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if (n1 == 0 && n2 == 0){
                break;
            }

            if (n2 % n1 == 0){ //약수
                System.out.println("factor");
            } else if (n1 % n2 == 0){
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
        sc.close();
    }
}

package math;

import java.util.*;

public class Num2720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for (int i = 0; i < t; i++) {
            int amount = sc.nextInt();
            int countQuarter = amount / quarter; // 쿼터 개수
            amount %= quarter; //나머지 금액

            int countDime = amount / dime; //다임 개수
            amount %= dime; // 나머지

            int countNickel = amount / nickel; //니켈 개수
            amount %= nickel; //나머지

            int countPenny = amount / penny; //페니 개수

            System.out.println(countQuarter + " " + countDime + " " + countNickel + " " + countPenny);
        }
    }
}

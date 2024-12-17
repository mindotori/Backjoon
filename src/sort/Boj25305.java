package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Boj25305 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
        }
        Collections.sort(list, Collections.reverseOrder()); //내림차순
        System.out.println(list);
        System.out.println(list.get(k-1));
    }
}

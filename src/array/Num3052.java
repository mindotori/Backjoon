package array;

import java.util.*;

public class Num3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> remain = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        // 각 원소들의 42로 나눈 나머지 배열
        for (int i = 0; i < list.size(); i++) {
            remain.add(list.get(i)%42);
        }
        // Set을 사용하여 중복값 제거
        Set<Integer> unique = new HashSet<>(remain);
        System.out.println(unique.size()); // 그냥 배열 크기 반환
}
}
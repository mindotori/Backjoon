package string;

import java.util.*;

public class Num1764 {
//Hash
    // n 듣도 m 보도 못한 녀석
    // n과 m에 둘 다 속하면 듣보잡
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //듣도
        int m = sc.nextInt(); //보도

        //듣도 못한 사람만 선언하고 보도 못한 사람은 입력값 따로 받아서 조건문 처리
        //중복 제거를 위해 아예 Set을 사용
        Set<String> d = new HashSet<>(); //듣도 못한
        List<String> dbj = new ArrayList<>();

        //듣도 못한
        for (int i = 0; i < n; i++) {
            d.add(sc.next()); // Set에 추가
        }

        //보도 못한
        for (int i = 0; i < m; i++) {
            String name = sc.next(); //이름 입력받
            //입력 받는 이름이 set에 있다면
            if(d.contains(name)){
                dbj.add(name);
            }
        }

        //출력: 듣보잡의 수 + 명단 "사전순"으로 출력
        //1.사전순 정렬
        Collections.sort(dbj);
        //2-1. 듣보잡의 수 출력
        System.out.println(dbj.size());
        //2-2. 듣보잡 명단 출력
        for (String s : dbj) {
            System.out.println(s);
        }

    }
}

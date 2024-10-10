import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        //주의: 공백이 연속해서 나오는 경우는 없다. 문자열은 공백으로 시작하거나 끝날 수 있다.*****
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        if (!s.isEmpty()) { // s가 비어있지 않으면
            String[] arr = s.split(" "); //공백 기준으로 잘라서 배열에 넣기
            System.out.println(arr.length); //단어 개수 출력
        } else {
            System.out.println(0); //문자열이 비어있으면 0 출력
        }
    }
}

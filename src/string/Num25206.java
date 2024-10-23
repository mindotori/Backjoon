package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// double 사용해야할듯
public class Num25206 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //학점별 평점 매핑
        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalCredits = 0.0; //학점 총합 (분모)
        double totalGradePoints = 0.0; //학점 * 평점의 총합 (분자)

        for (int i = 0; i < 20; i++) {
            String subject = sc.next(); //계산에는 필요없긴함
            double credits = sc.nextDouble(); // 학점
            String grade = sc.next(); // 평점

            if(!grade.equals("P") && gradeMap.containsKey(grade)){ // P등급은 계산하면 안됨
                double gradePoint = gradeMap.get(grade); //평점 가져오기
                totalGradePoints += credits * gradePoint; // 학점 * 평점 누적
                totalCredits += credits; // 학점 누적
            }
        }

        // 최종 전공 학점 계산
        // 오차값 줄이기 위해서 부동소수값 사용해서 출력하자
        double gpa = totalGradePoints / totalCredits;
        System.out.printf("%.6f%n",gpa);
    }
}

//전공학점: (학점 * 과목평점) / 학점의 총합
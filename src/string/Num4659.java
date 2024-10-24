package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Num4659 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Character> vowel = new ArrayList<>();
        vowel.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        List<Character> consonant = Arrays.asList(
                'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n',
                'p', 'q', 'r', 's', 't', 'v', 'x', 'z'
        );
        
       while (true){ //end 입력 시 종료
            String str = sc.next();

            if(str.equals("end")){
                break; // "end" 입력 시 종료
            }

           boolean hasVowel = false; //모음 포함 여부
           int vowelCount = 0; // 연속된 모음 수
           int consonantCount =0; // 연속된 자음 수
           boolean isValid = true; //유효 여부
           char prevChar = ' '; //이전 문자

           for (int i = 0; i < str.length(); i++) {
               char currentChar = str.charAt(i);

               //모음
               if(vowel.contains(currentChar)){
                   hasVowel = true;
                   vowelCount++;
                   consonantCount = 0;
               }
               else { //자음
                   consonantCount++;
                   vowelCount = 0;
               }

               // 모음이 3개 연속이거나 자음이 3개 연속이면 안됨
               if(vowelCount >= 3 || consonantCount >= 3){
                   isValid = false;
                   break;
               }

               // 같은 문자 두 번 연속 ㄴㄴ / 'ee' 'oo'는 가능
               if(i > 0 && currentChar == prevChar && currentChar != 'e' && currentChar != 'o'){
                   isValid = false;
                   break;
               }
               //i==0이면 비교할 prevChar(이전문자)가 없으므로

               prevChar = currentChar;
           }

           if(!hasVowel){
               isValid = false;
           }

           if(isValid){
               System.out.println("<" + str + "> is acceptable.");
           } else {
               System.out.println("<" + str + "> is not acceptable.");
           }
        }
        sc.close();
    }
}

package string;

import java.util.Scanner;

public class Num5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int r = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch =='A' || ch == 'B' || ch == 'C'){
                r += 3;
            } else if(ch =='D' || ch =='E'||ch =='F'){
                r+=4;
            } else if(ch =='G'||ch=='H'||ch=='I'){
                r+= 5;
            } else if(ch=='J'||ch=='K'||ch=='L'){
                r+=6;
            } else if (ch=='M'||ch=='N'||ch=='O'){
                r+=7;
            } else if(ch=='P'||ch=='Q'||ch=='R'||ch=='S'){
                r+=8;
            } else if(ch=='T'||ch=='U'||ch=='V'){
                r+=9;
            } else{
                r+=10;
            }
        }
        System.out.println();
    }
}

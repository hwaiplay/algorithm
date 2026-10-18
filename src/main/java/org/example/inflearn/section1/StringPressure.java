package org.example.inflearn.section1;

import java.util.Scanner;

/**
 * fileName       : StringPressure
 * author         : SeungHyeon.Kang
 * date           : 2026-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-18        SeungHyeon.Kang       최초 생성
 */
public class StringPressure {

    public static String solution(String s){
        String answer="";
        s+= " ";
        int charCount = 1;
        // s = KGG
        // answer = KG
        for (int i = 0; i < s.length(); i++) {
            if (answer.length() == 0) {
                answer += s.charAt(i);
            } else if(answer.length() != 0 && answer.charAt(answer.length()-1) != s.charAt(i)) {
                if(charCount > 1) answer += charCount;
                answer += s.charAt(i);
                charCount = 1;
            } else {
                charCount++;//2
            }


        }

        return answer.trim();
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }

}

package org.example.inflearn.section1;

import java.util.Scanner;

/**
 * fileName       : Palindrome2
 * author         : SeungHyeon.Kang
 * date           : 2026-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-18        SeungHyeon.Kang       최초 생성
 */
public class Palindrome2 {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(solution(str));
    }

    private static String solution(String s) {

        String answer="NO";
        s=s.toUpperCase().replaceAll("[^A-Z]", ""); // regex 의 ^ 는 부정을 뜻한다. 즉, 대문자 A-Z 가 아닌것들을 다 지워버리라는 의미.
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;

    }

}

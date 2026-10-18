package org.example.inflearn.section1;

import java.util.Scanner;

/**
 * fileName       : Palindrome1
 * author         : SeungHyeon.Kang
 * date           : 2026-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-18        SeungHyeon.Kang       최초 생성
 */
public class Palindrome1 {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(solution(str));
    }

    private static String solution(String str) {
        String reverse = new StringBuilder(str).reverse().toString(); //생성자 호출할 때 String 객체를 넣고 reverse 로 순서 뒤집어 준 후 toString으로 다시 String 객체로 돌린다.
        if(reverse.equalsIgnoreCase(str)) {
            return "YES";
        } else {
            return "NO";
        }
    }

}

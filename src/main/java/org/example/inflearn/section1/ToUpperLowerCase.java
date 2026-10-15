package org.example.inflearn.section1;

import java.util.Scanner;

/**
 * fileName       : ToUpperLowerCase
 * author         : SeungHyeon.Kang
 * date           : 2026-10-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-15        SeungHyeon.Kang       최초 생성
 */
public class ToUpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = "";

        for(char c : str.toCharArray()){ //String 을 쪼개서 계산해야하는 문제가 나오면 사용하기
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }

        System.out.println(answer);
    }
}

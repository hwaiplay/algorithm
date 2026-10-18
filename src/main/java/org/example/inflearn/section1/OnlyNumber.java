package org.example.inflearn.section1;

import java.util.Scanner;

/**
 * fileName       : OnlyNumber
 * author         : SeungHyeon.Kang
 * date           : 2026-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-18        SeungHyeon.Kang       최초 생성
 */
public class OnlyNumber {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(solution(str));
    }

    private static int solution(String str) {
        int answer = 0;
        str = str.replaceAll("[^0-9]", ""); //숫자가 아닌 것들을 다 ""로 replace
        if(str.length() > 0) answer = Integer.parseInt(str); //str의 길이가 0 보다 크면 parseInt 사용하여 Integer 타입으로 반환.
        return answer;                      // int 타입인 answer에 Integer 를 넣을 수 있는 이유는 오토언박싱(AutoUnboxing)이 되었기 때문이다.
    }

}

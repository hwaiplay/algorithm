package org.example.inflearn.section1;

import java.util.Scanner;

/**
 * fileName       : PasswordAnswer
 * author         : SeungHyeon.Kang
 * date           : 2026-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-18        SeungHyeon.Kang       최초 생성
 */
public class PasswordAnswer {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(solution(n, str));
    }

    private static String solution(int n, String str) {
        String answer="";
        for(int i=0; i<n; i++){
            String tmp=str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num=Integer.parseInt(tmp, 2);
            answer+=(char)num;
            str=str.substring(7); //substring에 파라미터를 하나만 넣으면 그 인덱스부터 끝까지 자른다는 의미.
            // 여기서는 계속 자른 문자열로 초기화해준다.
        }
        return answer;

    }
}

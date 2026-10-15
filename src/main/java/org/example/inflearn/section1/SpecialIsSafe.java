package org.example.inflearn.section1;

import com.sun.tools.javac.Main;

import java.util.Scanner;

/**
 * fileName       : SpecialIsSafe
 * author         : SeungHyeon.Kang
 * date           : 2026-10-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-15        SeungHyeon.Kang       최초 생성
 */
public class SpecialIsSafe {

    //특문을 제외한 경우 위치 바꾸기
    public static String solution(String str){
        String answer;
        char[] s = str.toCharArray(); //String을 char 타입 배열로 만든다.
        int lt=0, rt=str.length()-1;  //배열 첫번째 인덱스로 초기화, 배열의 가장 끝 인덱스(length -1)로 초기화
        while(lt<rt){                 // 배열 첫번째 인덱스를 저장한 변수(점차 증가)가 배열 가장 끝 인덱스를 저장한 변수보다 커졌을 때
            if(!Character.isAlphabetic(s[lt])) lt++; //lt가 특문이면 lt 만 1증가
            else if(!Character.isAlphabetic(s[rt])) rt--; //rt가  특문이면 rt 만 1감소
            else{//둘다 아닐때
                char tmp=s[lt]; //해당 인덱스 문자 저장
                s[lt]=s[rt]; //lt 증가 교체
                s[rt]=tmp;   //rt 교체
                lt++;        // lt 1증가, rt 1감소
                rt--;
            }
        }
        answer=String.valueOf(s);
        return answer;

    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }

}

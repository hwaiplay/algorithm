package org.example.inflearn.section1;

import com.sun.tools.javac.Main;

import java.util.Scanner;

/**
 * fileName       : SameCharDelete
 * author         : SeungHyeon.Kang
 * date           : 2026-10-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-15        SeungHyeon.Kang       최초 생성
 */
public class SameCharDelete {

    public static String solution(String str){
        //str.charAt(i) : str(String)의 i 번째에 있는 문자를 char 타입으로 반환
        //str.indexOf("a") or str.indexOf('a') : 받은 파라미터에 해당하는 문자나(char) 문자열이(String) 문자열의 몇번째 인덱스에 있는지 확인(int)로 리턴(처음으로 만난 문자를 판단)
        String answer="";
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(solution(str));
    }

}

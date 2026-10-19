package org.example.inflearn.section1;

import java.util.Scanner;

/**
 * fileName       : Password
 * author         : SeungHyeon.Kang
 * date           : 2026-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-18        SeungHyeon.Kang       최초 생성
 */
public class Password {

    public static void main(String[] args){
         
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(solution(n, str));
    }

    private static String solution(int n, String str) {
        char [] arr = new char[n];
        str = str.replace("#","1").replace("*","0");
        for(int i=0; i<n; i++){
            arr[i] = (char)Integer.parseInt(str.substring((i * 7), (7 * (i + 1))), 2);
        }

        return String.valueOf(arr);
    }
}


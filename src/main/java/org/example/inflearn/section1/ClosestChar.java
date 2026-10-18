package org.example.inflearn.section1;

import java.util.Scanner;

/**
 * fileName       : ClosestChar
 * author         : SeungHyeon.Kang
 * date           : 2026-10-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-18        SeungHyeon.Kang       최초 생성
 */
public class ClosestChar {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);
        for(int x : solution(str, c)){
            System.out.print(x+" ");
        }

    }

    private static int[] solution(String s, char t) {
        int [] answer = new int[s.length()];

        for(int i=0; i < s.length(); i++) {
            System.out.println("i : " + s.charAt(i));
            if(s.charAt(i) == t) { // 자기 자신일 경우 0 반환
                answer[i] = 0;
            } else {
                int lt = 0;
                int rt = 0;

                for(int j=i; j < s.length(); j++) {
                    System.out.println("j : " + s.charAt(j));
                    if(s.charAt(j) == t) {
                        rt = j-i;
                        break;
                    }
                }
                if(i != 0) {
                    for (int k = i; k >= 0; k--) {
                        System.out.println("k : " + s.charAt(k));
                        if (s.charAt(k) == t) {
                            lt = i-k;
                            break;
                        }
                    }
                }
                if(lt == 0) lt = rt;
                answer[i] = Math.abs(lt) <= rt ? lt : rt;
            }
        }
        return answer;
    }
}

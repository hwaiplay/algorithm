package org.example.algorithm.lv0;

import java.util.Scanner;

/**
 * fileName       : PcceNo3
 * author         : SeungHyeon.Kang
 * date           : 2026-09-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-09-13        SeungHyeon.Kang       최초 생성
 */
public class PcceNo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for(int i=0; i<1; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }

}

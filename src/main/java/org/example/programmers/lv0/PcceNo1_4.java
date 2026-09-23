package org.example.programmers.lv0;

import java.util.Scanner;

/**
 * fileName       : PcceNo1_4
 * author         : SeungHyeon.Kang
 * date           : 2026-09-13
 * description    : 병과분류
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-09-13        SeungHyeon.Kang       최초 생성
 */
public class PcceNo1_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals("_eye")){
            System.out.println("Ophthalmologyc");
        } else if(lastFourWords.equals("head")){
            System.out.println("Neurosurgery");
        } else if(lastFourWords.equals("infl")){
            System.out.println("Orthopedics");
        }else if(lastFourWords.equals("skin")){
            System.out.println("Dermatology");
        } else {
            System.out.println("direct recommendation");
        }
    }
}

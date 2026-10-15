package org.example.inflearn.section1;

import java.util.Scanner;

/**
 * fileName       : FindWord
 * author         : SeungHyeon.Kang
 * date           : 2026-10-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-15        SeungHyeon.Kang       최초 생성
 */
public class FindWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----문자를 입력해주세요----");
            String input1 = sc.next(); //한 단어는 next 사용
            if (input1.length() >= 1000) {
                System.out.println("----문자가 1000자가 넘지 않아야 합니다.----");
                break;
            }
            System.out.println("----비교문자를 입력해주세요----");
            char input2 = sc.next().charAt(0);
            System.out.println(input1 + input2);
            int count = 0;
            /*for (int i = 0; i < input1.length(); i++) {
                if (input1.charAt(i) == input2) {
                    count++;
                }
            }*/
            for(char c : input1.toCharArray()) {
                if(c == input2) {
                    count++;
                }
            }
            System.out.println(count);
            break;
        }
    }

}

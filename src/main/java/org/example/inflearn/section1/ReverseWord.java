package org.example.inflearn.section1;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * fileName       : ReverseWord
 * author         : SeungHyeon.Kang
 * date           : 2026-10-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-15        SeungHyeon.Kang       최초 생성
 */
public class ReverseWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 단어를 3개부터 20개까지 입력해주세요.");
        int n = sc.nextInt();
        String [] words = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("단어를 입력해주세요." + (n - i) + "개 남음");
            String input = sc.next();
            String reverse = new StringBuilder(input).reverse().toString(); //뒤집은 이후엔 toString으로 string 객체로 반환해야함
            words[i] = reverse;
        }

        System.out.println("단어 입력이 끝났습니다. 뒤집힌 결과입니다.");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

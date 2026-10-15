package org.example.inflearn.section1;

import java.util.Scanner;

/**
 * fileName       : WordInSentence
 * author         : SeungHyeon.Kang
 * date           : 2026-10-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-15        SeungHyeon.Kang       최초 생성
 */
public class WordInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        int longestCount = 0;
        String longestWord = "";
        String [] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() > longestCount) {
                longestCount = word.length();
                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
}

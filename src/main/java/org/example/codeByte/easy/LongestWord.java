package org.example.codeByte.easy;

import java.util.Scanner;

/**
 * fileName       : LongestWord
 * author         : SeungHyeon.Kang
 * date           : 2026-09-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-09-23        SeungHyeon.Kang       최초 생성
 */
public class LongestWord {

    public static String LongestWord(String sen) {
        // code goes here

        String lowerSen = null;
        String replaceSen = sen.replaceAll("[^a-zA-Z0-9 ]", "");
        String[] words = replaceSen.split(" ");
        int max = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].length() > max){
                max = words[i].length();
                if(max ==  words[i].length()){
                    lowerSen = words[i];
                }
            }
        }

        sen = lowerSen;

        return sen;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}

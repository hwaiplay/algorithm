package org.example.codeByte.easy;

import java.util.Scanner;

/**
 * fileName       : ReverseString
 * author         : SeungHyeon.Kang
 * date           : 2026-09-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-09-23        SeungHyeon.Kang       최초 생성
 */
public class ReverseString {

    public static String FirstReverse(String str) {
        // code goes here
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}

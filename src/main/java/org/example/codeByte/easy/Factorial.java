package org.example.codeByte.easy;

import java.util.Scanner;

/**
 * fileName       : Factorial
 * author         : SeungHyeon.Kang
 * date           : 2026-09-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-09-23        SeungHyeon.Kang       최초 생성
 */
public class Factorial {

    public static int FirstFactorial(int num) {
        // code goes here
        int result = 1;
        for(int i=1; i<=num; i++){
            result *= i;
        }
        num = result;
        return num;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }
}

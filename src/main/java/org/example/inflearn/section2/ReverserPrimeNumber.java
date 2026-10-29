package org.example.inflearn.section2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * fileName       : ReverserPrimeNumber
 * author         : SeungHyeon.Kang
 * date           : 2026-10-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-29        SeungHyeon.Kang       최초 생성
 */
public class ReverserPrimeNumber {

    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp != 0) {
                res = res * 10 + tmp % 10;
                tmp /= 10;
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverserPrimeNumber T = new ReverserPrimeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }


}

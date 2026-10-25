package org.example.inflearn.section2;

import java.util.Scanner;

/**
 * fileName       : FibonacciSequence
 * author         : SeungHyeon.Kang
 * date           : 2026-10-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-25        SeungHyeon.Kang       최초 생성
 */
public class FibonacciSequence {
    public int[] solution(int n){
        int [] ans = new int[n];
        ans[0] = 1;
        ans[1] = 1;
        for(int i=2;i<n;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans;

    }
    public static void main(String[] args){
        FibonacciSequence T = new FibonacciSequence();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        for(int x :T.solution(n)) System.out.print(x+" ");
    }

}

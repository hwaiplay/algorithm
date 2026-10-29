package org.example.inflearn.section2;

import java.util.Scanner;

/**
 * fileName       : ScoreCalculation
 * author         : SeungHyeon.Kang
 * date           : 2026-10-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-29        SeungHyeon.Kang       최초 생성
 */
public class ScoreCalculation {

    public int solution(int n, int[] arr){
        int answer=0, cnt=0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer+=cnt;
            } else {
                cnt=0;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        ScoreCalculation T = new ScoreCalculation();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}


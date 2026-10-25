package org.example.inflearn.section2;

import java.util.Scanner;

/**
 * fileName       : ShowableStudent
 * author         : SeungHyeon.Kang
 * date           : 2026-10-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-25        SeungHyeon.Kang       최초 생성
 */
public class ShowableStudent {

    public static int solution(int n, int[] arr){
        int answer = 1;
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(solution(n, arr));
    }

}

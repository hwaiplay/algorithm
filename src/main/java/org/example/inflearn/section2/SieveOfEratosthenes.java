package org.example.inflearn.section2;

import java.util.Scanner;

/**
 * fileName       : SieveOfEratosthenes
 * author         : SeungHyeon.Kang
 * date           : 2026-10-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-25        SeungHyeon.Kang       최초 생성
 */
public class SieveOfEratosthenes {

    public int solution(int n){
        int cnt=0;
        int[] ch = new int[n+1]; //int 배열은 배열의 값들이 모두 0으로 초기화 된다.
        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                cnt++;
                for(int j=i; j<=n; j=j+i) ch[j]=1; //j+i 를 해야 i 만큼 증가하며 i 의 배수를 모두 1로 만들어줄 수 있다.
            }
        }

        return cnt;
    }
    public static void main(String[] args){
        SieveOfEratosthenes T = new SieveOfEratosthenes();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(T.solution(n));
    }

}

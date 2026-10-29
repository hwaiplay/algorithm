package org.example.inflearn.section2;

import java.util.Scanner;

/**
 * fileName       : FindTheRank
 * author         : SeungHyeon.Kang
 * date           : 2026-10-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-10-29        SeungHyeon.Kang       최초 생성
 */
public class FindTheRank {

    public int[] solution(int n, int[] arr){
      int [] answer = new int[n];
      for(int i=0; i<n; i++){
          int cnt = 1;
          for(int j=0; j<n; j++){
              if(arr[i] < arr[j]){
                  cnt++;
              }
          }
          answer[i] = cnt;
      }

      return answer;
    }
    public static void main(String[] args){
        FindTheRank T = new FindTheRank();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x :T.solution(n, arr)) System.out.print(x+" ");
    }
}

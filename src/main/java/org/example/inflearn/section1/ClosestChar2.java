package org.example.inflearn.section1;

import java.util.Scanner;

public class ClosestChar2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for (int x : solution(str, c)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];

        // 충분히 큰 값으로 거리 초기화 (문자열 최대 길이보다 큰 값)
        int p = 1000;

        // 1. 왼쪽 -> 오른쪽으로 가면서 왼쪽 t와의 거리 계산
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }

        // 2. 오른쪽 -> 왼쪽으로 오면서 오른쪽 t와의 거리와 비교 후 최소값 선택
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p); // 더 작은 거리를 저장
            }
        }

        return answer;
    }
}
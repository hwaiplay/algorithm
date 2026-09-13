package org.example.algorithm.lv0;

import java.util.Arrays;

/**
 * fileName       : PcceNo1_5
 * author         : SeungHyeon.Kang
 * date           : 2026-09-13
 * description    : 심폐소생술
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-09-13        SeungHyeon.Kang       최초 생성
 */
public class PcceNo1_5 {

    public static void main(String[] args) {

        String[] cpr = {"pressure", "call", "check", "repeat", "respiration"};

        int[] answer = solution(cpr);
        System.out.println("answer :: "+ Arrays.toString(answer));
    }
        public static int[] solution(String[] cpr){

            int[] answer = {0, 0, 0, 0, 0};

            String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

            for (int i = 0; i < cpr.length ; i++) { //pressure
                for (int j = 0; j < basic_order.length; j++) {//pressure
                    if (cpr[i].equals(basic_order[j])) {//check = check
                        answer[i] = j + 1;
                        break;
                    }
                }
            }
            return answer;
        }
    }


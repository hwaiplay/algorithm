package org.example.algorithm.lv0;

/**
 * fileName       : PcceNo1_6
 * author         : SeungHyeon.Kang
 * date           : 2026-09-13
 * description    : 물부족
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-09-13        SeungHyeon.Kang       최초 생성
 */
public class PcceNo1_6 {

    public static void main(String[] args) {

        PcceNo1_6 pcc = new PcceNo1_6();
        int[] change = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};
        int result = pcc.solution(1000, 2000, change);
        System.out.println("result :: "+ result);
    }

    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage += usage * change[i] / 100;
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}

package org.example.programmers.lv0;

/**
 * fileName       : PceeNO1_8
 * author         : SeungHyeon.Kang
 * date           : 2026-09-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-09-23        SeungHyeon.Kang       최초 생성
 */
public class PceeNO1_8 {

    public static void main(String[] args) {
        PceeNO1_8 pcc = new PceeNO1_8();
        String result = pcc.solution("GO");
        System.out.println("result :: "+ result);
    }

    // 1.4자 미만일 경우 o을 채우지 못 하고 있음
    public String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        while (answer.length() < 4){
            answer += "o";
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}

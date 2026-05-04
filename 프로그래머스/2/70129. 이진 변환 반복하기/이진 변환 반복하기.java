/*
2진수에서 0을 제거
0제거한 수를 십진수로 교체
*/

class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int zero = 0;
        
        while(!s.equals("1")) {
            int len = s.length(); // 기존 s의 크기
            
            s = s.replace("0", ""); // 0없앰
            
            zero += len - s.length();
            
            s = Integer.toBinaryString(s.length());
           
            cnt++;
        }
        
        int[] answer = new int[2];
        answer[0] = cnt;
        answer[1] = zero;
        return answer;
    }
}
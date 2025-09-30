class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char temp = 0;
        for(int i=0; i<code.length(); i++){
            
            if(i%q==r) {
                temp = code.charAt(i);
                answer += temp;
            }
        }
        
        return answer;
    }
}
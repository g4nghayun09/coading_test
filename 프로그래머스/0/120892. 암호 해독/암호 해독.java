class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code; i<=cipher.length(); i+=code){
            char temp = cipher.charAt(i-1);
            answer += temp;
            }
        return answer;
    }
}
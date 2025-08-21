class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<n; i++){
            char temp = my_string.charAt(i);
            answer += temp;
        }
        return answer;
    }
}
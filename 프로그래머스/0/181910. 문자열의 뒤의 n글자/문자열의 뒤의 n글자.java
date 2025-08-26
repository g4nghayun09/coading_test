class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=my_string.length()-n; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            answer += temp;
        }
        return answer;
    }
}
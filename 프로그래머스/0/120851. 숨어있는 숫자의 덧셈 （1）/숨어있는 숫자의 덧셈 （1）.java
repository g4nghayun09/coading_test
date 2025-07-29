class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            if(temp>48&&temp<58)
                answer += temp-48;
        }
        return answer;
    }
}
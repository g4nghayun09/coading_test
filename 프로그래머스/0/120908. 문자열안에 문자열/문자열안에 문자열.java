class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2))
            answer ++;
        else if(answer==0)
            answer = 2;
        return answer;
    }
}
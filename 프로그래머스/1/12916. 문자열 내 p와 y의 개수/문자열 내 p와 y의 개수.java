class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt=0;
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            if(temp == 80||temp == 112)
                cnt++;
            else if(temp == 89||temp ==121)
                cnt--;
        }
        if(cnt!=0)
            answer = false;
        return answer;
    }
}
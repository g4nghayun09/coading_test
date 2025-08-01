class Solution {
    public String solution(String n_str) {
        String answer = "";
        int cnt = 0;
        for(int i=0; i<n_str.length(); i++){
            char temp = n_str.charAt(i);
            if(temp == 48 && cnt==0)
                continue;
            if(temp != 48||cnt>0){
                cnt++;
                answer += temp;
            }
        }
        return answer;
    }
}
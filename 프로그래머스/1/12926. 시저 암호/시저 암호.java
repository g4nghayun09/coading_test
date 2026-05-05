class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if('a'<=ch&&ch<='z') {
                if(ch+n<='z') {
                    ch+=n;
                }
                else {
                    ch = (char)(ch+n-26);
                }
            }
            else if('A'<=ch&&ch<='Z'){
                if(ch+n<='Z') {
                    ch+=n;
                }
                else {
                    ch = (char)(ch+n-26);
                }
            }
            
            answer += ch;
        }
        return answer;
    }
}
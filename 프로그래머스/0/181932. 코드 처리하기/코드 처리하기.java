class Solution {
    public String solution(String code) {
        String answer = "";
        String ret = "";
        boolean boo = true;
         for(int i=0; i<code.length(); i++) {
             char ch = code.charAt(i);
             if(ch=='1'){
                 boo = !boo;
             } else if(boo&&i%2==0) {
                 answer += ch;
             } else if(!boo&&i%2==1) {
                 answer += ch;
             }
         }
        if(answer.isEmpty())
            answer = "EMPTY";
        return answer;
    }
}
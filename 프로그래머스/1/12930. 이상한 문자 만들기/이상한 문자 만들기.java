class Solution {
    public String solution(String s) {
        String answer = "";
        int j=1;
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            cnt++;
            char temp = s.charAt(i);
            if(temp == ' '){
                cnt=0;
                answer += ' ';
            }
            else{
                if(cnt%2==1){
                    if(temp>='a'&&temp<='z')
                        temp -= 32;
                }
                else{
                    if(temp>='A'&&temp<='Z')
                        temp += 32;
                }
                answer += temp;
            }
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char one = 0;
        char oneone = 0;
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            cnt = 0;
            one = s.charAt(i);
            for(int j=0; j<s.length(); j++){
                oneone =s.charAt(j);
                if(one == oneone)
                    cnt++;
            }
            if(cnt==1)
                answer+=one;
        }
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        return answer;
    }
}
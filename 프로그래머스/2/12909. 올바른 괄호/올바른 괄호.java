import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<String> stk = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            if(str.equals("(")){
                stk.push(str);
            }
            else {
                if(stk.isEmpty())
                    return false;
                else {
                    stk.pop();
                }
            }
        }
        if(stk.size()!=0)
            return false;
        return answer;
    }
}
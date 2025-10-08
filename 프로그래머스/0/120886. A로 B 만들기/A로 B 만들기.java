import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        String[] b = before.split("");
        Arrays.sort(b);
        
        String[] a = after.split("");
        Arrays.sort(a);
        
        for(int i=0; i<a.length; i++){
            if(!(a[i].equals(b[i]))){
                answer=0;
                break;
            }
        }
        
        return answer;
    }
}
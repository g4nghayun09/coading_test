import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++) {
            if(citations.length - i <= citations[i]&&citations[i]!=0) {
                answer = citations.length - i;
                break;
            }
        }
        return answer;
    }
}
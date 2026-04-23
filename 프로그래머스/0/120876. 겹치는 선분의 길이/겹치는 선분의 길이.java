import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int min = 101;
        int max = -101;
        
        for(int i=0; i<lines.length; i++) {
            if(lines[i][0]<min)
                min = lines[i][0];
            if(lines[i][1]>max)
                max = lines[i][1];
        }
        
        for(int i=min; i<max; i++) {
            int cnt = 0;
            for(int j=0; j<lines.length; j++) {
                if(lines[j][0] <= i && i+1 <= lines[j][1])
                    cnt++;
            }
            if(cnt>=2)
                answer++;
        }
        return answer;
    }
}
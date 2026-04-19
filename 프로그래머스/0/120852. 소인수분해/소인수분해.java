import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            boolean exist = true;
            if(n%i==0) {
                for(int j=2; j<=i; j++) {
                    if(i%j==0&&i!=j)
                        exist = false;
                }
                if(exist)
                    list.add(i);
            }
            
        }
        
        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int i=2; i<=n; i++) {
            boolean exist = true;
            if(n%i==0) {
                for(int j=2; j<=i; j++) {
                    if(i%j==0&&i!=j)
                        exist = false;
                }
                if(exist){
                    answer[cnt] = i;
                    cnt++;
                }
                    
            }
            
        }
        
        return answer;
    }
}
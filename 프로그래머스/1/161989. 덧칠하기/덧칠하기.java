class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] present = new boolean[n];
        //boolean[] re = new boolean[n];
        
        for(int i=0; i<n; i++) {
            present[i] = false;
            //re[i] = false;
        }
        for(int i=0; i<section.length; i++) {
            present[section[i]-1] = true;
            //re[section[i]-1] = true;
        }
        
        for(int i=0; i<present.length; i++) {
            if(present[i]) {
                i+=m-1;
                answer++;
            }
                
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<absolutes.length; i++){
            // if(signs[i] = false)
                answer += (signs[i]==true) ? absolutes[i] : -absolutes[i];
            // else if(signs[i] = true)
            //     answer += absolutes[i];
        }
        
        return answer;
    }
}
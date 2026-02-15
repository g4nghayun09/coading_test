class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int bigNum = Math.max(sides[0], sides[1]);
        int smallNum = Math.min(sides[0], sides[1]);
        
        for(int i=1; i<=bigNum; i++) {
            if(smallNum+i>bigNum)
                answer++;
        }
        for(int i=bigNum+1; i<bigNum+smallNum; i++) {
            
            answer++;
        }
        return answer;
    }
}
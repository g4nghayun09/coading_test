class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] attack = new int[3];
        int cnt = 0;
        int temp; 
        for(int i=5; i>0; i-=2){
            answer += hp/i;
            hp %= i;
        }    
        return answer;
    }
}
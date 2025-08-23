class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] attack = new int[3];
        attack[0] = 5;
        attack[1] = 3;
        attack[2] = 1;
        int cnt = 0;
        int temp; 
        for(int i=0; i<3; i++){
            answer += hp/attack[i];
            hp %= attack[i];
        }    
        return answer;
    }
}
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long Pmoney = 0;
        for(int i=1; i<=count; i++){
            Pmoney += price*i;
        }
        answer = (Pmoney>money)?Pmoney-money:0;
        return answer;
    }
}
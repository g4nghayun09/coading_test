class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if (n >= 10) {
            k *= 2000;
            k -= (n/10)*2000;
            n *= 12000;
            answer = n + k;
        }
        else {
            n *= 12000;
            k *= 2000;
            answer = n + k;
        }
            
        return answer;
    }
}
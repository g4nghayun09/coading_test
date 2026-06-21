class Solution {
    public int solution(int n) {
        int answer = n;
        int binaryCnt = Integer.bitCount(n);
        int cnt = 0;
        while(true) {
            answer++;
            cnt = Integer.bitCount(answer);
            if(binaryCnt==cnt)
                break;
            
        }
        return answer;
    }
}
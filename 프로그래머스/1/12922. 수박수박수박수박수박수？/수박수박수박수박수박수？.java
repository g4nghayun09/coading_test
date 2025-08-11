class Solution {
    public String solution(int n) {
        String answer = "";
        char su = '수';
        char back = '박';
        for(int i=1; i<=n; i++){
            if(i%2==1)
                answer += su;
            else
                answer += back;
        }
        return answer;
    }
}
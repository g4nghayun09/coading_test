class Solution {
    public int[] solution(int n, int k) {
        
        int cnt = 0;
        int num = k;
        for(int i=k; i<=n; i+=k){
            cnt++;
        }
        int[] answer = new int[cnt];
        
        for(int i=0; i<cnt; i++){
            answer[i] = num;
            num+=k;
        }
        return answer;
    }
}
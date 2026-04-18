/*
5의 10의 배수 찾고 11의 배수 따로따로 생각하기
*/

class Solution {
    public int[] solution(int l, int r) {
        int cnt = 0;
        for(int i=l; i<=r; i++) {
            if((Integer.toString(i).replace("5", "").replace("0", "")).length()==0)
                cnt++;
            
        }
        
        if(cnt==0) {
            int[] otherAnswer = {-1};
            return otherAnswer;
        }
        int[] answer = new int[cnt];
        cnt=0;
        for(int i=l; i<=r; i++) {
            if((Integer.toString(i).replace("5", "").replace("0", "")).length()==0){
                answer[cnt] = i;
                cnt++;
            }
            
        }
        return answer;
    }
}
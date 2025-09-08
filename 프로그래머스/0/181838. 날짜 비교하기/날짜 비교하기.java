class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for(int i=2; i>=0; i--){
            if(date1[i]<date2[i]){
                answer = 1;
            }
            if(date1[i]>date2[i]){
                answer = 0;
            }
            else if(date1[i]==date2[i]){
                continue;
            }
        }
        // if(date1[0]>date2[0]){
        //     answer = 0;
        // }
        // if(date1[0]<date2[0]){
        //     answer = 1;
        // }
        return answer;
    }
}
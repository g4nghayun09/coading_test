class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int cnt = 0;
        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        cnt=0;
        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                answer[cnt] = arr[j];
                cnt++;
            }
        }
        return answer;
    }
}
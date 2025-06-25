class Solution {
    public int solution(int[][] arr) {
        int i=0;
        int j=0;
        int answer = 0;
        outerLoop:
        for(i=0; i<arr.length; i++){
            for(j=0; j<arr.length; j++){
                if(arr[i][j]==arr[j][i])
                    answer = 1;
                else{
                    answer = 0;
                    break outerLoop;
                }
            }
        }
        return answer;
    }
}
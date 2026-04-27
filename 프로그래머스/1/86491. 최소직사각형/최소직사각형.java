class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] arr = new int[sizes.length][2];
        
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0]>=sizes[i][1]) {
                arr[i][0] = sizes[i][0];
                arr[i][1] = sizes[i][1];
            }
            else{
                arr[i][0] = sizes[i][1];
                arr[i][1] = sizes[i][0];
            }
        }
        int max0 = 0;
        int max1 = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i][0]>max0)
                max0 = arr[i][0];
            if(arr[i][1]>max1)
                max1 = arr[i][1];
        }
        
        answer = max0*max1;
        return answer;
    }
}
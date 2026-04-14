class Solution {
    public int[][] solution(int[][] arr) {
        // 최댓값 찾기
        int maxRow = arr.length;
        int maxLow = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(maxLow<arr[i].length)
                    maxLow = arr[i].length;
            }
        }
        int max = Math.max(maxRow, maxLow);
        int[][] answer = new int[max][max];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i].length>j&& arr.length>i)
                    answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}
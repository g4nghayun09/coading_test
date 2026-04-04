class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0; i<queries.length; i++) {
            answer[i] = 999999;
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int j=s; j<=e; j++) {
                if(k<arr[j] && answer[i]>arr[j])
                    answer[i] = arr[j];
            }
            if(answer[i] == 999999)
                answer[i] = -1;
        }
        return answer;
    }
}
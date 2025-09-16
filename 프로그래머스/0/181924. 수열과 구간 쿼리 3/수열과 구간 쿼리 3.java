class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++)
            answer[i] = arr[i];
        //for(int  i=0; i<arr.length; i++){
            for(int j=0; j<queries.length; j++){
                temp = answer[queries[j][0]];
                answer[queries[j][0]] = answer[queries[j][1]];
                answer[queries[j][1]] = temp;
            }
        //}
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length==1){
            int[] arr1 = {-1};
            return arr1;
        }
        else {
            int[] answer = new int[arr.length-1];
            int min = arr[0];
            for(int i=0; i<arr.length; i++) {
                if(min>arr[i])
                    min = arr[i];
            }
            int cnt= 0;
            for(int i=0; i<arr.length; i++) {
                if(min == arr[i]) {
                    continue;
                }
                else {
                    answer[cnt] = arr[i];
                    cnt++;
                }
            }
            return answer;
        }
        
    }
}
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt = arr.length;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    cnt--;
                    break;
                }
            }
        }
        
        int [] answer = new int[cnt];
        cnt=0;
        
        for(int i=0; i<arr.length; i++){
            int j;
            for(j=0; j<delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    break;
                }
            }
            if(j == delete_list.length) {
                answer[cnt] = arr[i];
                cnt++;
                    
            }
        }
        return answer;
    }
}
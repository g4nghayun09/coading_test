class Solution {
    public int[] solution(int[] arr) {
        boolean dis=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                dis = true;
                break;
            }
        }
        int[] answer = {};
        if(dis){
            int cnt=0;
            int first = 0;
            int back = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]==2){
                    first=i;
                    break;
                }
            }
            for(int i=arr.length-1; i>=0; i--){
                if(arr[i]==2){
                    back=i;
                    break;
                }
            }
            cnt=back-first;
            answer = new int[cnt+1];
             cnt = 0;
            for(int i=first; i<=back; i++){
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        else{
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}
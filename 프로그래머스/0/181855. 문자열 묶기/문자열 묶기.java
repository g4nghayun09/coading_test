class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int max = 0;
        int[] arr = new int[strArr.length];
        
        for(int i=0; i<strArr.length; i++) {
            arr[strArr[i].length()]++;
        }
        
        for(int i=0; i<strArr.length; i++) {
            if(arr[i]>answer)
                answer = arr[i];
            
        }
        return answer;
    }
}
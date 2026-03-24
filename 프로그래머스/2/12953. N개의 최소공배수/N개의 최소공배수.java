class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        while(true) {
            for(int i=0; i<arr.length; i++) {
                if(answer%arr[i]!=0)
                    break;
                else if(i==arr.length-1)
                    return answer;
            }
            answer++;
        }
        
    }
}
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int ar1 = 0;
        int ar2 = 0;
        
        if(arr1.length!=arr2.length)
            answer = (arr1.length < arr2.length) ? -1:1;
        else if(arr1.length == arr2.length){
            for(int i=0; i<arr1.length; i++){
                ar1 += arr1[i];
                ar2 += arr2[i];
            }
            
            answer = (ar1>ar2) ? 1:-1;
            if(ar1==ar2)
                answer =0;
        }
        
        return answer;
    }
}
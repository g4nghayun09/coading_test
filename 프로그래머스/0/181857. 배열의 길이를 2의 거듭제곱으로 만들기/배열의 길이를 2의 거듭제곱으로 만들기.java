class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        int num = 1;
        if(arr.length!=1) {
            while(true){
                num *= 2;
                if(num==arr.length||num>arr.length){
                    break;
                }
            }
        }
        else
            num=1;
        int[] answer = new int[num];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
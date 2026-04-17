class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] equalArr = new int[arr.length];
        int exist = 0;
        // 중복이 있을 때 까지 돌림
        for(int i=0; i<arr.length ;i++) {
            equalArr[i] = arr[i];
        }
        
        while(true) {
            exist = 0;
            // 조건에 따라 변환
            for(int i=0; i<arr.length; i++) {
                if(arr[i]>=50 && arr[i]%2==0)
                    arr[i] /= 2;
                else if(arr[i]<50 && arr[i]%2==1){
                    arr[i] *= 2;
                    arr[i]++;
                }
            }
            // 전과 같나 확인
            for(int i=0; i<arr.length; i++) {
                if(arr[i]==equalArr[i]) {
                    exist++;
                }
            }
            // 같으면 break;
            if(exist==arr.length)
                break;
            // 아니면 equalArr에 복붙 - equalArr은 전과 같나 확인하는 
            for(int i=0; i<arr.length; i++) {
                equalArr[i] = arr[i];
            }
            
            
            answer++;
        }
        
        
        
        return answer;
    }
}
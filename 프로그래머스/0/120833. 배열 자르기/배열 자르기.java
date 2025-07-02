class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int cnt=0; 
        for(int i=num1;i<=num2; i++){
            cnt++;
        }
        int[] answer = new int[cnt];
        
        int j=0;
        for(int i=num1; i<=num2; i++){
            answer[j] = numbers[i];
            j++;
        }
        return answer;
    }
}
class Solution {
    public int solution(int num1, int num2) {
        int answer = (num1 + num2); 
        if (answer == num1 + num1){
            answer = 1;
        } 
        else if (answer != num1 + num1)
            answer = -1;
        return answer;
    }
}
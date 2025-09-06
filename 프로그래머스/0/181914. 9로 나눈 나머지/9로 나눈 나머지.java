class Solution {
    public int solution(String number) {
        int answer = 0;
        int temp = 0;
        for(int i=0; i<number.length(); i++){
            char ch = number.charAt(i);
            temp += ch-48;
        }
        answer = temp%9;
        return answer;
    }
}
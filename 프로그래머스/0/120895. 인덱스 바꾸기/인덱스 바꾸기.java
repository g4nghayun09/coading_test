class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            if(i==num1)
                temp = my_string.charAt(num2);
            if(i==num2)
                temp = my_string.charAt(num1);
            answer += temp;
        }
        return answer;
    }
}
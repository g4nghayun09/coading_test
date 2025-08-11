class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            char temp = myString.charAt(i);
            if(temp<=108||temp<=76)
                answer += 'l';
            else 
                answer += temp;
        }
        return answer;
    }
}
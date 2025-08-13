class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            char temp = myString.charAt(i);
            if(temp <= 90 && 65 <= temp)
                temp += 32;
            answer += temp;
        }
        return answer;
    }
}
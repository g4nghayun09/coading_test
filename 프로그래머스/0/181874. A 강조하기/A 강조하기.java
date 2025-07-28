class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            char temp = myString.charAt(i);
            if(temp==97||temp==65)
                temp = 65;
            else if(temp>=65&&temp<=90)
                temp += 32;
            answer += temp;
            
        }
        return answer;
    }
}
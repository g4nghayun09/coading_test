class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++){
            char temp = myString.charAt(i);
            if(97<=temp&&temp<=122)
                temp -= 32;
            answer += temp;
        }
        return answer;
    }
}
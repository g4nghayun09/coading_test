class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            if(60<=temp&&90>=temp)
                temp += 32;
            else
                temp -= 32;
                answer +=  temp;
            
        }
        return answer;
    }
}
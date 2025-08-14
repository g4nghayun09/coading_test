class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            switch(temp){
                case (97) :   
                    break;
                case (101) :  
                    break;
                case (105) :   
                    break;
                case (111) :   
                    break;
                case (117) : 
                    break;
                default : answer += temp;
                    break;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        char temp;
        char temp2;
        for(int i=0; i<2; i++){
            temp = my_string.charAt(i);
            temp2 = is_prefix.charAt(i);
            if(temp == temp2)
                answer++;
        }
    
        if(answer==2){
            answer = 1;
            if(is_prefix.length()>my_string.length())
                answer = 0;
        }
        else
            answer = 0;
        return answer;
    }
}
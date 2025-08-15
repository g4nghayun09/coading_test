class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            char temp = rsp.charAt(i);
            if(temp == 50)      //가위
                temp = 48;
            else if(temp == 48) //바위
                temp = 53;
            else if(temp == 53)
                temp = 50;
            answer += temp;
        }
        return answer;
    }
}
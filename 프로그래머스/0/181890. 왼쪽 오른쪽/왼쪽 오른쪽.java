class Solution {
    public String[] solution(String[] str_list) {
        int isL = 0;
        int isR = 0;
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                isL = i;
                break;
            }
            if(str_list[i].equals("r")){
                isR = i;
                break;
            }
        }
        String[] answer = {};
        if(isL!=0||str_list[0].equals("l")){
            answer = new String[isL];
            for(int i=0; i<isL; i++){
                answer[i] = str_list[i];
            }
        }
        else if(isR!=0||str_list[0].equals("r")){
            int cnt = 0;
            answer = new String[str_list.length-isR-1];
            for(int i=isR+1; i<str_list.length; i++){
                answer[cnt] = str_list[i];
                cnt++;
            }
        }
    
        return answer;
    }
}
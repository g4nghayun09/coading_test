class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        int cnt = 0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad"))
                continue;
            else
                cnt++;
        }
        answer = new String[cnt];
        cnt=0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad"))
                continue;
            else{
                answer[cnt] = strArr[i];
                cnt++;
            }
                
        }
        return answer;
    }
}
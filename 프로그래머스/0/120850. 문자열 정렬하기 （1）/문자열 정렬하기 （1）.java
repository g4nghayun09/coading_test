class Solution {
    public int[] solution(String my_string) {
        int cnt=0;
        for(int i=0; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            if(temp<58&&temp>47)
                cnt++;
        }
        int[] answer = new int[cnt];
        cnt=0;
        for(int i=0; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            if(temp<58&&temp>47){
                answer[cnt] = temp-48;
                cnt++;
            }
        }
        cnt=0;
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer.length-1-i; j++){
                if(answer[j]>answer[j+1]){
                    cnt = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = cnt;
                }
            }
        }
        return answer;
    }
}
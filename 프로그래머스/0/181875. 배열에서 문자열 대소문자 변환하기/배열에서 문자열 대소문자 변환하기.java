class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        char temp = 0;
        for(int i=0; i<strArr.length; i++){
            answer[i] = "";
            for(int j=0; j<strArr[i].length(); j++){
                temp = strArr[i].charAt(j);
                if(i%2==0){
                    if(temp>='a'&&temp<='z')
                        answer[i]+=temp;
                    else{
                        temp+=32;
                        answer[i]+=temp;
                    }
                }
                else{
                    if(temp>='a'&&temp<='z'){
                        temp -= 32;
                        answer[i]+=temp;
                    }
                    else
                        answer[i]+=temp;
                }
            }
        }
        return answer;
    }
}
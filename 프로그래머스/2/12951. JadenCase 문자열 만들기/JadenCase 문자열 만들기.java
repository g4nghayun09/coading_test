class Solution {
    public String solution(String s) {
        String answer = "";
        String str = "";
        char temp = 0;
        // 소문자로 바꾸기
        for(int i=0; i<s.length(); i++){
            temp = s.charAt(i);
            if(temp<='Z'&&temp>='A')
                temp+=32;
            str += temp;
        }
        // ' '다음에 대문자로 바꾸기
        
        temp = str.charAt(0);
        if(temp<='z'&&temp>='a')
            temp -= 32;
        answer += temp;
        char minuse = 0;
        for(int i=1; i<s.length(); i++){
            temp = str.charAt(i);
            minuse = str.charAt(i-1);
            if(minuse==' '){
                if(temp<='z'&&temp>='a')
                    temp -= 32;
            }
            answer += temp;
        }
        return answer;
    }
}
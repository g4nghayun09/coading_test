import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str = "";
        //소문자로 만들기
        for(int i=0; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            if(temp>='A'&&temp<='Z'){
                temp += 32;
            }
            str += temp;
        }
        // 버블 정렬 하기.
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        answer = new String(arr);
        return answer;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {"EMPTY"};
        // list에 다 넣기
        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;
        String temp = "";
        for(int i=0; i<myStr.length(); i++) {
            char ch = myStr.charAt(i);
            if(ch=='a'||ch=='b'||ch=='c'){
                if(!(temp.equals("")))
                    list.add(temp);
                temp = "";
            } else {
                temp += ch;
            }
        }
        if(!temp.equals("")) {
            list.add(temp);
        }
        if(list.size()==0)
            return answer;
        answer = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
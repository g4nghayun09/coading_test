import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String replace = myString;
        if(myString.charAt(0)=='x')
             replace = replace.substring(1);
        if(myString.charAt(myString.length()-1)=='x')
            replace = replace.substring(0, replace.length() - 1);

        String[] parts = replace.split("x");

        
        ArrayList<String> list = new ArrayList<>();
        for (String s : parts) {
            if (!s.equals("")) list.add(s);
        }

        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}
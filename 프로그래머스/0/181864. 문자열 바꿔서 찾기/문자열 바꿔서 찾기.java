class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String temp = "";
        for(int i=0; i<myString.length(); i++){
            char ch = myString.charAt(i);
            if(ch=='A')
                ch='B';
            else if(ch=='B')
                ch='A';
            temp += ch;
        }
        if(temp.contains(pat))
            answer = 1;
        return answer;
    }
}
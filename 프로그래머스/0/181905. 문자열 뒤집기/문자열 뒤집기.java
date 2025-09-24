class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] str = new String[3];
        str[0]="";
        str[1]="";
        str[2]="";
        String re = "";
        for(int i=0; i<s; i++){
            char temp = my_string.charAt(i);
            str[0]+=temp;
        }
        for(int i=s; i<=e; i++){
            char temp = my_string.charAt(i);
            str[1]+=temp;
        }
        for(int i=e+1; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            str[2]+=temp;
        }
        for(int i=str[1].length()-1; i>=0; i--){
            char temp = str[1].charAt(i);
            re += temp;
        }
        answer += str[0]+re+str[2];
        return answer;
    }
}
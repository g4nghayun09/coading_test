class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char temp=0;
        String str="";
        char ch=(char)(k+'0'); 
        for(int I=i; I<=j; I++){
            str=Integer.toString(I);
            for(int J=0; J<str.length(); J++){
                temp = 0;
                temp = str.charAt(J);
                if(temp==ch)
                    answer++;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(String s) {
        int answer = 0;
        int temp = 0;
        String[] S = s.split(" ");
        for(int i=0; i<S.length; i++){
            if(!(S[i].equals("Z")))
                answer += Integer.parseInt(S[i]);
            else if(S[i].equals("Z")||i!=0)
                answer -= Integer.parseInt(S[i-1]);
        }
        return answer;
    }
}
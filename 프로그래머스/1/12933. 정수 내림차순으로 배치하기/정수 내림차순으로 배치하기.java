class Solution {
    public Long solution(long n) {
        String Answer = "";
        String N = Long.toString(n);
        int[] num = new int[N.length()];
        for(int i=0; i<N.length(); i++){
            char temp = N.charAt(i);
            num[i] = temp-48;
        }
        
        for(int i=0; i<N.length(); i++){
            for(int j=0; j<N.length()-1-i; j++){
                if(num[j]<num[j+1]){
                    int te = num[j];
                    num[j] = num[j+1];
                    num[j+1] = te;
                }
            }
        }
        for(int i=0; i<N.length(); i++){
            Answer += num[i];
        }
        long ttemp = Long.parseLong(Answer);
        long answer = ttemp;
        return answer;
    }
}
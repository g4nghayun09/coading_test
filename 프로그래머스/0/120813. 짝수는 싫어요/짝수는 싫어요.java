class Solution {
    public int[] solution(int n) {
        int[] answer;
        if(n%2==1)
            answer=new int[1+(n/2)];
        else
            answer=new int[(n/2)];
       
        for(int i=0; i<=n; i++){
            if(i%2==1)          //홀수
                answer[i/2] = i;
        }
        return answer;
    }
}
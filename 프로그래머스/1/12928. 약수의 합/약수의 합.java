class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        if(n!=0){
            do{
                if(n%i==0)
                    answer += i;
                i++;
            }while(i<=n&&n!=0);
        }
        
        return answer;
    }
}
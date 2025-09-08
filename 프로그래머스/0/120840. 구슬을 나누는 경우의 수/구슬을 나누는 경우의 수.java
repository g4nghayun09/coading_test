class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        double bFac = 1;
        double sFac = 1;
        double bsFac = 1;
        
        for(int i=1; i<=balls; i++)
            bFac *= i;
        for(int i=1; i<=share; i++)
            sFac *= i;
        for(int i=1; i<=balls-share; i++)
            bsFac *= i;
        System.out.print(sFac);
        //answer = Math.round((long)(bFac/(bsFac*sFac)));
        double result = bFac/(bsFac*sFac);
        answer = (int)Math.round(result);
        return answer;
    }
}
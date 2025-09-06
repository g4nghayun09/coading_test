class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A=Integer.toString(a);
        String B=Integer.toString(b);
        String AB=A+B;
        String BA=B+A;
        int sumAB = Integer.parseInt(AB);
        int sumBA = Integer.parseInt(BA);
        
        if(sumAB>sumBA)
            answer = sumAB;
        else
            answer = sumBA;
        
        return answer;
    }
}
import java.util.*;
class Solution{
    public int solution(int []A, int []B)    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int[] b = new int[B.length];
        int cnt = 0;
        for(int i=B.length-1; i>=0; i--){
            b[cnt] = B[i];
            cnt++;
        }
        
        for(int i=0; i<A.length; i++){
            answer += A[i] * b[i];    
        }
        return answer;
    }
}
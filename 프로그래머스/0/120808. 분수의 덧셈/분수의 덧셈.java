class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
              // 분자
        
        if(denom1==denom2){                                  // 분모
            answer[1] = denom1;
            answer[0] = numer1+numer2;
        }
        else{
            answer[1] = denom1*denom2;
            answer[0] = (numer1*denom2)+(numer2*denom1);
            }
        for(int i=answer[1]; i>1; i--){                    // 약분
            if(answer[0]%i==0&&answer[1]%i==0){
                answer[0]/=i;
                answer[1]/=i;
            }
        }
   
            
        return answer;
    }
}
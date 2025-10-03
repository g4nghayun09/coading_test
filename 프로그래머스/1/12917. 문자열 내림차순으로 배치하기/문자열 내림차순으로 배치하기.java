class Solution {
    public String solution(String s) {
        String answer = "";
        int S=0;
        int B=0;
        char temp = 0;
        for(int i=0; i<s.length(); i++){
            temp = s.charAt(i);
            if(temp>='A'&&temp<='Z')
                B++;
            else
                S++;
        }
        char[] small = new char[S];
        char[] big = new char[B];
        S=0;
        B=0;
        for(int i=0; i<s.length(); i++){
            temp = s.charAt(i);
            if(temp>='A'&&temp<='Z'){
                big[B]=temp;
                B++;
            }    
            else{
                small[S]=temp;
                S++;
            }
        }
        //---------------------------------------------
        for(int i=0; i<big.length; i++){
            for(int j=0; j<big.length-1-i; j++){
                if(big[j]>big[j+1]){
                    temp=big[j];
                    big[j] = big[j+1];
                    big[j+1] = temp; 
                }
            }
        }
        for(int i=0; i<big.length; i++)
            answer+=big[i];
        for(int i=0; i<small.length; i++){
            for(int j=0; j<small.length-1-i; j++){
                if(small[j]>small[j+1]){
                    temp=small[j];
                    small[j] = small[j+1];
                    small[j+1] = temp; 
                }
            }
        }
        for(int i=0; i<small.length; i++)
            answer+=small[i];
        
        //-----------------------------------------------
        String str="";
        for(int i=answer.length()-1; i>=0; i--){
            temp=answer.charAt(i);
            str+=temp;
        }
        answer=str;
        return answer;
    }
}
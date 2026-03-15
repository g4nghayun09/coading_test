class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] mathPart = polynomial.split(" \\+ ");
        int x = 0;
        int num = 0;
        
        for(int i=0; i<mathPart.length; i++) {
            if(mathPart[i].equals("x"))
                x += 1;
            else if(mathPart[i].contains("x")){
                mathPart[i] = mathPart[i].replaceAll("x","");
                x += Integer.parseInt(mathPart[i]);
            }
                
            else
                num += Integer.parseInt(mathPart[i]);
        }
        
        if(x!=0){
            if(x==1)
                answer += "x";
            else 
                answer += x+"x";
        }
            
        if(x!=0&&num!=0)
            answer += " + ";
        
        if(num!=0)
            answer += num;
        return answer;
    }
}
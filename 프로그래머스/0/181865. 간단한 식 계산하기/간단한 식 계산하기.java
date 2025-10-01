class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] bino = binomial.split(" ");
        int a = Integer.parseInt(bino[0]);
        String ab = bino[1];
        int b = Integer.parseInt(bino[2]);
        if(ab.equals("+")){
            answer = a+b;
        }
        if(ab.equals("-")){
            answer = a-b;
        }
        if(ab.equals("*")){
            answer = a*b;
        }
        
        return answer;
    }
}
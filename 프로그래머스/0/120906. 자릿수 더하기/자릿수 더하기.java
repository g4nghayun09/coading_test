class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(int i=0; i<str.length(); i++){
            char temp = str.charAt(i);
            answer += temp-48;
            
            System.out.print(answer+" ");
        }
        return answer;
    }
}
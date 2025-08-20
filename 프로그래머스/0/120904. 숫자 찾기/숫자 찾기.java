class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String Num = Integer.toString(num);
        for(int i=0; i<Num.length(); i++){
            char temp = Num.charAt(i);
            if(temp-48 == k){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}
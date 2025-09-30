class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = Integer.toString(age);
        char temp = 0;
        for(int i=0; i<ageStr.length(); i++){
            temp = ageStr.charAt(i);
            temp += 49;
            answer += temp;
        }
        return answer;
    }
}
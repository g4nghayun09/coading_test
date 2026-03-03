class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"SAT", "SUN","MON","TUE","WED","THU","FRI"};
        int[] month = {5, 1, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        answer = day[((month[a-1]+b)%7)];
                
        
        return answer;
    }
}
// 
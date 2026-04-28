class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<nums.length; i++) {
            str = s.replaceAll(nums[i], Integer.toString(i));
            s = str;
        }
        answer = Integer.parseInt(str);
        return answer;
    }
}
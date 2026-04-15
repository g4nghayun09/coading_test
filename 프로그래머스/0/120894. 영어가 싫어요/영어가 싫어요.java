class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] nums = 
        {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<nums.length; i++) {
            numbers = numbers.replaceAll(nums[i], Integer.toString(i));
        }
        
        answer = Long.valueOf(numbers);
        
        
        return answer;
    }
}
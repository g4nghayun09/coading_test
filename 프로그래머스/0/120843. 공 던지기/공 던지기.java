class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        k = (k-1)*2;
        answer = numbers[k%numbers.length];
        return answer;
    }
}
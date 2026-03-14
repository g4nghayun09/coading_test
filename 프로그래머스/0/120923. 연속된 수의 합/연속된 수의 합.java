class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int sum = 0;
        int minNum = 0-num;
        int index = 0;
        
        while(true) {
            index=0;
            sum=0;
            for(int i=minNum; i<num+minNum; i++) {
                sum += i;
                answer[index] = i;
                index++;
            }
            if(total==sum)
                break;
            minNum++;
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[1+(end_num-start_num)];
        int i=0;
        for(int sn=start_num; sn<=end_num; sn++){
            answer[i] = sn;
            i++;
        }
        return answer;
    }
}

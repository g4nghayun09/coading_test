class Solution {
    int i = 0;
    int plu = 0;
    int minu = 0;
    public int[] solution(int[] num_list) {
        for(; i<num_list.length; i++){
            if(num_list[i]%2==0)
                plu += 1;
            else
                minu += 1;
        }
        int[] answer = {plu, minu};
        return answer;
    }
}
class Solution {
    public int[] solution(int[] num_list, int n) {
        int cnt = 0;
        if(num_list.length%n==0)
            cnt = num_list.length/n;
        else
            cnt = (num_list.length/n)+1;
        int[] answer = new int[cnt];
        cnt=0;
        for(int i=0; i<num_list.length; i+=n){
            answer[cnt] = num_list[i];
            cnt++;
        }
        return answer;
    }
}
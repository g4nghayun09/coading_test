class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int solo = 0;
        int couple = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(i % 2==1)
                solo += num_list[i];
            else if(i % 2==0)
                couple += num_list[i];
        }
        if(solo>couple)
            answer = solo;
        if(solo<couple)
            answer = couple;
        if(solo==couple)
            answer = solo;
           
        return answer;
    }
}
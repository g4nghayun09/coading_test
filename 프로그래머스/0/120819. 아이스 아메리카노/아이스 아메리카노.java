class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int i=0;
        if(money<5500){
            answer[0]=0;
            answer[1]=0;
        }
        do{
            answer[0] = i;
            answer[1] = money-(5500*i);
            i++;  
        }while(money>=5500*i);
        return answer;
    }
}
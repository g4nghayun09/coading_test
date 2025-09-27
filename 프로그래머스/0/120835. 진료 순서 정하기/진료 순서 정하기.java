class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[][] dis = new int[2][emergency.length];
        for(int i=0; i<emergency.length; i++){
            dis[0][i] = emergency[i];
            dis[1][i] = emergency.length;
        }
        int temp = 0;
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(dis[0][i]<dis[0][j])
                    dis[1][j]--;
            }
        }
        for(int i=0; i<emergency.length; i++)
            answer[i] = dis[1][i];
        return answer;
    }
}
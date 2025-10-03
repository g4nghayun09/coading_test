class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[][] Sco = new double[score.length][2];
        for(int i=0; i<score.length; i++){
            Sco[i][0] = ((score[i][0]+score[i][1])/2.0);
        }
        //System.out.print((double)((score[i][0]+score[i][1])/2));
        for(int i=0; i<score.length; i++){
            Sco[i][1]++;
            for(int j=0; j<score.length; j++){
                if(Sco[i][0]<Sco[j][0])
                    Sco[i][1]++;
            }
        }
        for(int i=0; i<score.length; i++){
            answer[i] = (int)Sco[i][1];
        }
        return answer;
    }
}
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int booY = 0;
        int booX = 0;
        for(int i=0; i<keyinput.length; i++){
            booY = answer[1];
            booX = answer[0];
            
            switch(keyinput[i]){
                case "up":
                    if(booY+1 <= board[1]/2)
                        answer[1]++;
                    break;
                case "down":
                    if(booY-1 >= -board[1]/2)
                        answer[1]--;
                    break;
                case "right":
                    if(booX+1 <= board[0]/2)
                        answer[0]++;
                    break;
                case "left":
                    if(booX-1 >= -board[0]/2)
                        answer[0]--;
                    break;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[i][j] == 1) {
                    if(i>0 && j>0) {
                        if(board[i-1][j-1]<=0) {
                            board[i-1][j-1]--;
                        }
                    }
                    if(i>0) {
                        if(board[i-1][j]<=0) {
                            board[i-1][j]--;
                        }
                    }
                    if(i>0 && j<board.length-1) {
                        if(board[i-1][j+1]<=0) {
                            board[i-1][j+1]--;
                        }
                    }
                    if(j>0) {
                        if(board[i][j-1]<=0) {
                            board[i][j-1]--;
                        }
                    }
                    if(j<board.length-1) {
                        if(board[i][j+1]<=0) {
                            board[i][j+1]--;
                        }
                    }
                    if(i<board.length-1 && j>0) {
                        if(board[i+1][j-1]<=0) {
                            board[i+1][j-1]--;
                        }
                    }
                    if(i<board.length-1) {
                        if(board[i+1][j]<=0) {
                            board[i+1][j]--;
                        }
                    }
                    if(i<board.length-1 && j<board.length-1) {
                        if(board[i+1][j+1]<=0) {
                            board[i+1][j+1]--;
                        }
                    }
                }
            }
        }
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[i][j]==0)
                    answer++;
            }
            
        }
        return answer;
    }
}
function solution(board, k) {
    var answer = 0;
    for(let x in board) {
        for(let i=0; i<board[x].length; i++) {
            if(parseInt(x)+parseInt(i)<=k)
                answer+=board[x][i];
        }
    }
    return answer;
}
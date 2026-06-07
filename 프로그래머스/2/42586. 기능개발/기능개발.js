function solution(progresses, speeds) {
    var answer = [];
    let priority = [];
    for( let x in progresses) {
        let cnt = 0;
        while(true) {
            if(progresses[x]>=100) {
                break;
            }
            cnt++;
            progresses[x] += speeds[x];
        }
        if(priority.length === 0) {
            priority.push(cnt);
            answer.push(1);
        }
        else if(cnt>priority[priority.length-1]) {
            priority.push(cnt);
            answer.push(1);
        }
        else {
            answer[answer.length-1]++;
        }
    }
    return answer;
}
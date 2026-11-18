function solution(arr)
{
    let answer = [];
    answer.push(arr[0]);
    for(let x of arr) {
        if(answer[answer.length-1]!=x) {
            answer.push(x);
        }
    }
    return answer;
}
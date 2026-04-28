function solution(arr) {
    var answer = '';
    for(let x in arr) {
        answer += arr[x];
    }
    return answer;
}
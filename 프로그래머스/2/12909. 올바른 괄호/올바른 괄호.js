function solution(s){
    var answer = true;

    let stack = [];
    for(let x of s) {
        if(x=="(") {
            stack.push("(");
        }
        else if(x==")"&&stack.length!=0){
            stack.pop();
        }
        else if(x==")"&&stack.length==0) {
            return false;
        }
    }
    if(stack.length!=0) {
        return false;
    }

    return true;
}
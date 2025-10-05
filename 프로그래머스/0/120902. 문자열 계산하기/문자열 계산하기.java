class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        answer = Integer.parseInt(arr[0]);
        for(int i=1; i<arr.length; i++){
            if("+".equals(arr[i])){
                answer += Integer.parseInt(arr[i+1]);
            }
            if("-".equals(arr[i])){
                answer -= Integer.parseInt(arr[i+1]);
            }
            
        }
        return answer;
    }
}
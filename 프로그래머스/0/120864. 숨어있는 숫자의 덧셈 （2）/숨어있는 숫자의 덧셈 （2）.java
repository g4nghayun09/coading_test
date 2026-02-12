class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[^0-9]+");
        for(int i=0; i<arr.length; i++) {
            if(!arr[i].isEmpty())
                answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
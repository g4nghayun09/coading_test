class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            arr[i] = ""+temp;
        }
        
        answer += arr[0];
        
        boolean dis = false;
        for(int i=1; i<arr.length; i++){
            dis = false;
            for(int j=0; j<answer.length(); j++){
                if(arr[i].equals(""+answer.charAt(j))){
                    dis = true;
                    break;
                }
            }
            if(!dis){
                answer += arr[i];
            }
        }
        System.out.print(arr[0]);
        return answer;
    }
}
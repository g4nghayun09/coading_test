class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        StringBuilder str = new StringBuilder(my_string);
        for(int i=0; i<my_string.length(); i++){
            if(str.toString().equals(is_suffix)){
                answer = 1;
                break;
            }
            str=new StringBuilder(my_string);
            str.delete(0,i);
            System.out.println(str+"*****");
        }
        return answer;
    }
}
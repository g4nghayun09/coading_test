class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String add = "";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0)
                even += num_list[i];
            else
                add += num_list[i];
        }
        int Add = Integer.parseInt(add);
        int Even = Integer.parseInt(even);
        answer = Add+Even;
        return answer;
    }
}
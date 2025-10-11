class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int cnt = 0; 
        if(n==1){
            answer = new int[slicer[1]+1];
            for(int i=0; i<=slicer[1]; i++)
                answer[i] = num_list[i];
        }
        else if(n==2){
            answer = new int[num_list.length-slicer[0]];
            for(int i=slicer[0]; i<num_list.length; i++){
                answer[cnt] = num_list[i];
                cnt++;
            }
        }
        else if(n==3){
            for(int i=slicer[0]; i<=slicer[1]; i++){
                cnt++;
            }
            answer = new int[cnt];
            cnt=0;
            for(int i=slicer[0]; i<=slicer[1]; i++){
                answer[cnt] = num_list[i];
                cnt++;
            }
        }
        else{
            for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]){
                cnt++;
            }
            answer = new int[cnt];
            cnt=0;
            for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]){
                answer[cnt] = num_list[i];
                cnt++;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(int[] array, int n) {
        int temp = 0;
        int i = 0;
        int answer = 0;
        if(array.length>1){
            while(i<array.length){
                for(int j=0; j<array.length-i-1; j++){
                    if(Math.abs(array[j]-n) > Math.abs(array[j+1]-n)){
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
                i++;
            }
            answer = array[0];
            if(Math.abs(array[0]-n)==Math.abs(array[1]-n))
            answer = (array[0]<array[1]) ? array[0] : array[1];
        }
        else
            answer = array[0];
        return answer;
    }
}
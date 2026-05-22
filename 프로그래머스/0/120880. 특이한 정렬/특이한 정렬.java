class Solution {
    public int[] solution(int[] numlist, int n) {
        
        for(int i=0; i<numlist.length; i++) {
            for(int j=i; j<numlist.length; j++) {
                if(numlist[i]>numlist[j]) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        
        for(int i=0; i<numlist.length; i++) {
            for(int j=0; j<numlist.length; j++) {
                if(Math.abs(numlist[i]-n)<=Math.abs(numlist[j]-n)) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        
        return numlist;
    }
}
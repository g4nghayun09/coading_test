class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] lett = letter.split(" ");
        String[] mose = {".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."};
        int temp = 97;
        for(int i=0; i<lett.length; i++){
            for(int j=0; j<mose.length; j++){
                if(lett[i].equals(mose[j])){
                    answer += (char)(temp+j);
                    break;
                }
            }
        }
        return answer;
    }
}
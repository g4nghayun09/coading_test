class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] arr = {};
        int cal = 0;
        for(int i=0; i<quiz.length; i++){
            arr = quiz[i].split(" ");
            cal = Integer.parseInt(arr[0]);
            for(int j=0; j<arr.length; j++){
                if(arr[j].equals("+")){
                    cal += Integer.parseInt(arr[j+1]);
                }
                if(arr[j].equals("-")){
                    cal -= Integer.parseInt(arr[j+1]);
                }
            }
            System.out.println(cal+"    "+arr[arr.length-1]);
            if(cal==Integer.parseInt(arr[arr.length-1]))
                answer[i] = "O";
            else
                answer[i] = "X";
        }
        return answer;
    }
}
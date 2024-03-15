class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                index = 0;
                answer.append(ch);
            }else{
                if(index % 2 == 0){
                    answer.append(Character.toUpperCase(ch));
                }else{
                    answer.append(Character.toLowerCase(ch));
                }
                index++;
            }
        }
        
        
        return answer.toString();
    }
}
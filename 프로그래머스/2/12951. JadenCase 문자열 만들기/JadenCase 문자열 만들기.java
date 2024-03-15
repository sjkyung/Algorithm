class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isValid = true;
      
        for(char word : s.toCharArray()){
            
            
            if(word == ' '){
                isValid = true;
                answer.append(word);
                continue;
            }
            
            if(isValid){
                answer.append(Character.toUpperCase(word));
                isValid = false;
            }else{
                answer.append(Character.toLowerCase(word));
            }            
               
            
        }
        
        
        return answer.toString();
    }
}
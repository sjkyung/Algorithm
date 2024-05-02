class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++){
            
            if(true == signs[i]){
                answer += absolutes[i];
            } else if(false == signs[i]){
                answer -= absolutes[i];
            }
        }
        
        
        
        
        return answer;
    }
}
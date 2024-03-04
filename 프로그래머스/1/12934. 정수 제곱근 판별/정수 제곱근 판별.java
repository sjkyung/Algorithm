
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        
        double sprt = Math.sqrt(n);
        
        if(sprt % 1 == 0){
            answer = (long) Math.pow(sprt +1, 2);
        }else answer = -1;
        
        return answer;
    }
}
class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        
        answer = hp / 5;
        answer += (hp % 5) / 3;
        answer += ((hp % 5) % 3) /1;
        
        return answer
    }
}
class Solution {
    fun solution(n: Int): MutableList<Int> {
        var answer: MutableList<Int> = mutableListOf()
        for(i in 1..n){
            if(i % 2 == 1){
                answer.add(i)
            }
        }
        
        return answer
    }
}
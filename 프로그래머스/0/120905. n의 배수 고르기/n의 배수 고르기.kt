class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        for(num in numlist){
            if(num % n == 0){
                answer.add(num)
            }
        }
        
        return answer.toIntArray()
    }
}
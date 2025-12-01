class Solution {
    fun solution(sides: IntArray): Int {
        val max = sides.maxOrNull()!!
        val sum = sides.sum() - max
        
        return if(max < sum) 1 else 2
    }
}
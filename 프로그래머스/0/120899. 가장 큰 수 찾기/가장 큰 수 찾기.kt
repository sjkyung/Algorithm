class Solution {
    fun solution(array: IntArray): IntArray {
        
        val max = array.maxOrNull()!!
        val index = array.indexOf(max)
        
        return intArrayOf(max,index)
    }
}
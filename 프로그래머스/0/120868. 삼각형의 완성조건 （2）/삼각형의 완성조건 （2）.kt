class Solution {
    fun solution(sides: IntArray): Int {
        val max = maxOf(sides[0], sides[1])
        val min = minOf(sides[0], sides[1])
        return (max + min - 1) - (max - min)
    }
}
class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val xList = dots.map { it[0] }
        val yList = dots.map { it[1] }

        val width = xList.maxOrNull()!! - xList.minOrNull()!!   
        val height = yList.maxOrNull()!! - yList.minOrNull()!!  

        return width * height
    }
}
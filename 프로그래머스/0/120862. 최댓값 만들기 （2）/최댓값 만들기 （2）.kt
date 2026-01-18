class Solution {
    fun solution(numbers: IntArray): Int {
        val sorted = numbers.sorted()
        val max1 = sorted.takeLast(2).reduce { a, b -> a * b }
        val max2 = sorted.take(2).reduce { a, b -> a * b }   
        return maxOf(max1, max2)
    }
}
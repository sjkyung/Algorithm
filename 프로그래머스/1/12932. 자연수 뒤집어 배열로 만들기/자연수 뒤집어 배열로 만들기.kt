class Solution {
    fun solution(n: Long): IntArray {
    var num = n
    val result = mutableListOf<Int>()

    while (num > 0) {
        result.add((num % 10).toInt())
        num /= 10
    }

    return result.toIntArray()
    }
}
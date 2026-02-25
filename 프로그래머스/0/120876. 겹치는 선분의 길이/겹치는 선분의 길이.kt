class Solution {
    fun solution(lines: Array<IntArray>): Int {
        val count = IntArray(201)

        for (line in lines) {
            val start = line[0] + 100
            val end = line[1] + 100

            for (i in start until end) {
                count[i]++
            }
        }

        return count.count { it >= 2 }
    }
}
class Solution {
    fun solution(n: Int): Int {
        var count = 0
        for (i in 1..n) {
            var divisor = 0
            for (j in 1..i) {
                if (i % j == 0) divisor++
            }
            if (divisor >= 3) count++
        }
        return count
    }
}
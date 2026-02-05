class Solution {
    fun solution(polynomial: String): String {
        val terms = polynomial.split(" + ")
        var xSum = 0
        var numSum = 0

        for (term in terms) {
            if (term.contains("x")) {
                val coeff = term.replace("x", "")
                xSum += if (coeff.isEmpty()) 1 else coeff.toInt()
            } else {
                numSum += term.toInt()
            }
        }

        return when {
            xSum != 0 && numSum != 0 -> "${if (xSum == 1) "x" else "${xSum}x"} + $numSum"
            xSum != 0 -> if (xSum == 1) "x" else "${xSum}x"
            else -> "$numSum"
        }
    }
}
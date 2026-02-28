class Solution {
    fun solution(a: Int, b: Int): Int {
        
       
        fun gcd(x: Int, y: Int): Int =
            if (y == 0) x else gcd(y, x % y)

        val g = gcd(a, b)
        var denominator = b / g

        while (denominator % 2 == 0) {
            denominator /= 2
        }
        while (denominator % 5 == 0) {
            denominator /= 5
        }


        return if (denominator == 1) 1 else 2
    }
}
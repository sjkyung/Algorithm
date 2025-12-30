class Solution {
    fun solution(n: Int): Int {
       val sqrt = kotlin.math.sqrt(n.toDouble())  
       return if (sqrt % 1 == 0.0) 1 else 2 
    }
}
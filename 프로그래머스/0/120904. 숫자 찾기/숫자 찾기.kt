class Solution {
    fun solution(num: Int, k: Int): Int {
       val numArray = num.toString().toCharArray()

        for ((index, ch) in numArray.withIndex()) {
            if (ch == k.toString()[0]) {   
                return index + 1           
            }
        }
        return -1                          
    }
}
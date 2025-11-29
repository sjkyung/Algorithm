class Solution {
    fun solution(s: String): Int {
        val stack = mutableListOf<Int>()
        val parts = s.split(" ")

        for (part in parts) {
            if (part == "Z") {
                if (stack.isNotEmpty()) stack.removeLast()  
            } else {
                stack.add(part.toInt()) 
            }
        }

        return stack.sum()
    }
}
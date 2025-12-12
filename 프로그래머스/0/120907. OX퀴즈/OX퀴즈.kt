class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        val result = mutableListOf<String>()

        for (q in quiz) {
            val parts = q.split(" = ")       
            val expression = parts[0].split(" ") 

            val x = expression[0].toInt()
            val op = expression[1]
            val y = expression[2].toInt()
            val z = parts[1].toInt()

            val calc = if (op == "+") x + y else x - y

            if (calc == z) result.add("O")
                else result.add("X")
            }

        return result.toTypedArray()
        }
}
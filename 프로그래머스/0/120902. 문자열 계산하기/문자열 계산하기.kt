class Solution {
    fun solution(my_string: String): Int{
      val tokens = my_string.split(" ")
      var result = tokens[0].toInt()

        for (i in 1 until tokens.size step 2) {
            result += if (tokens[i] == "+") tokens[i + 1].toInt()
                      else -tokens[i + 1].toInt()
        }

        return result
    }
}
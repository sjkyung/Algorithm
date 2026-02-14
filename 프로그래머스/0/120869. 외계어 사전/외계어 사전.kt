class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        val sortedSpell = spell.sorted().joinToString("")

        for (word in dic) {
            if (word.length == spell.size &&
                word.toCharArray().map { it.toString() }.sorted().joinToString("") == sortedSpell
            ) {
                return 1
            }
        }
        return 2
    }
}
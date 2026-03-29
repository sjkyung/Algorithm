class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        val inputId = id_pw[0]
        val inputPw = id_pw[1]

        for (user in db) {
            val dbId = user[0]
            val dbPw = user[1]

            if (dbId == inputId) {
                return if (dbPw == inputPw) "login" else "wrong pw"
            }
        }
        return "fail"
    }
}
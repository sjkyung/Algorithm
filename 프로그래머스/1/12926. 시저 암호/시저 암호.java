class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(' ');
            } else if (Character.isLowerCase(c)) {
                // 소문자 처리: 'a'에서 'z' 사이
                char shifted = (char) ((c - 'a' + n) % 26 + 'a');
                answer.append(shifted);
            } else if (Character.isUpperCase(c)) {
                // 대문자 처리: 'A'에서 'Z' 사이
                char shifted = (char) ((c - 'A' + n) % 26 + 'A');
                answer.append(shifted);
            }
        }
        return answer.toString();
    }
}

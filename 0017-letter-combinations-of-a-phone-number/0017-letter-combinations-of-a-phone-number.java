class Solution {
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

public List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<>();
    if (digits == null || digits.length() == 0) return res;
    StringBuilder sb = new StringBuilder();
    combine(res, digits, sb, 0);
    return res;
}

private void combine(List<String> res, String digits, StringBuilder sb, int posn) {
    if (posn == digits.length()) {
        res.add(sb.toString());
        return;
    }
    String letters = KEYS[digits.charAt(posn) - '0'];
    for (int i = 0; i < letters.length(); i++) {
        int sbLen = sb.length();
        combine(res, digits, sb.append(letters.charAt(i)), posn+1);
        sb.setLength(sbLen);
    }
}
}
package z.learn;

public class Q0014LongestCommonPrefix {
    private String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        Q0014LongestCommonPrefix instance = new Q0014LongestCommonPrefix();
        assert "fl".equals(instance.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}

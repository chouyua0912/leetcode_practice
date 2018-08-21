package z.learn;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 无重复字符的最长子串是 "abc"，其长度为 3。
 * <p>
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 无重复字符的最长子串是 "b"，其长度为 1。
 * <p>
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 无重复字符的最长子串是 "wke"，其长度为 3。
 * 请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
 * <p>
 * https://leetcode-cn.com/articles/longest-substring-without-repeating-characters/
 */
public class Q0003LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0, current = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int index = stringBuilder.indexOf("" + s.charAt(i));
            if (-1 != index) {
                if (stringBuilder.length() != index + 1) {
                    current = current - index;
                } else {
                    current = 1;
                }
                stringBuilder.delete(0, index + 1);
                stringBuilder.append(s.charAt(i));
            } else {
                stringBuilder.append(s.charAt(i));
                current++;
            }

            if (current > max)
                max = current;
        }
        return max;
    }
}

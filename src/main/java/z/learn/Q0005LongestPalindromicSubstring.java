package z.learn;

/**
 * 有bug,算法不正确
 */
class Q0005LongestPalindromicSubstring {

    String longestPalindrome(String s) {
        if ("".equals(s) || s.length() == 1) return s;
        String palindrom = s.substring(0, 1);
        StringBuilder strs = new StringBuilder();
        int pal = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = strs.lastIndexOf("" + c);  // 返回的地址是从左到右的地址　 abccbabb  abcbab abcbb
            strs.append(c);
            if (index >= 0) {
                if (-1 == pal) {
                    if (strs.length() == index + 2 || strs.length() == index + 3) {
                        if (index == 0) {
                            if (palindrom == null || strs.length() > palindrom.length()) {
                                palindrom = strs.toString();
                            }
                            pal = -1;
                        } else {
                            pal = index - 1;
                        }
                    }
                } else if (index == pal) {
                    if (pal == 0) {
                        if (palindrom == null || strs.length() > palindrom.length()) {
                            palindrom = strs.toString();
                        }
                        pal = -1;
                    } else {
                        pal--;
                    }
                } else {
                    strs.delete(0, pal + 1);
                    if (palindrom == null || strs.length() - 1 > palindrom.length()) {
                        palindrom = strs.substring(0, strs.length() - 1);
                    }
                    pal = -1;
                }
            } else if (pal >= 0) {
                strs.delete(0, pal + 1);
                if (palindrom == null || strs.length() - 1 > palindrom.length()) {
                    palindrom = strs.substring(0, strs.length() - 1);
                }
                pal = -1;
            }
        }
        return palindrom;
    }
}

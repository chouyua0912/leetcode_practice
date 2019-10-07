package z.learn;

import java.util.LinkedList;

public class Q0020ValidParentheses {

    private static final String left = "({[";
    private static final String right = ")}]";

    static boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        if (s != null && !"".equals(s)) {
            for (char c : s.toCharArray()) {
                if (left.indexOf(c) != -1) {
                    stack.push(c);
                } else {
                    Character peek = stack.peek();
                    if (peek == null) {
                        return false;
                    } else {
                        if (left.indexOf(peek) == right.indexOf(c)) {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        assert isValid("()");
        assert isValid("()[]{}");
        assert !isValid("(]");
        assert !isValid("([)]");
        assert isValid("{[]}");
        assert !isValid("[");
        assert !isValid("]");
        System.out.println("finished");
    }
}

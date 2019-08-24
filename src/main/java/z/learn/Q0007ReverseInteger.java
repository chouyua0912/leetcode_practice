package z.learn;

public class Q0007ReverseInteger {

    private static int reverse(int x) {
        boolean minus = false;
        if (x < 0) {
            minus = true;
        }
        String input = Long.valueOf(Math.abs((long) x)).toString();
        StringBuilder resultStr = new StringBuilder();
        for (char c : input.toCharArray()) {
            resultStr.insert(0, c);
        }
        long longResult = Long.parseLong((minus ? "-" : "") + resultStr.toString());

        if (longResult > Integer.MAX_VALUE || longResult < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) longResult;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(0));
        System.out.println(reverse(120));
        System.out.println(reverse(-123));
        System.out.println(reverse(Integer.MAX_VALUE));
        System.out.println(reverse(Integer.MIN_VALUE));
    }
}

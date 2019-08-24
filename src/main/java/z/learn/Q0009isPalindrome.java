package z.learn;

public class Q0009isPalindrome {

    private static boolean isPalindrome(int x) {
        String xStr = Integer.valueOf(x).toString();
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            for (int i = 0; i < xStr.length() / 2; i++) {
                if (xStr.charAt(i) != xStr.charAt(xStr.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(122));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(9));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(-12));
    }
}

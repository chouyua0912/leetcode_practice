package z.learn;

import java.util.ArrayList;
import java.util.List;

public class Q0862AtLeastKArray {

    private static int shortestSubarray(int[] A, int K) {
        if (A == null || A.length < 1 || A.length > 5000 || K < 1)
            return -1;
        int[] cache = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            cache[i] = 0;
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                int val = A[j] + cache[j - i];
                if (val >= K) {
                    return i + 1;
                } else {
                    cache[j - i] = val; // 缓存
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(shortestSubarray(new int[]{1}, 1));
        System.out.println(shortestSubarray(new int[]{1, 2}, 4));
    }
}

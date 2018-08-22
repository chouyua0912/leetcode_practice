package z.learn;

import java.util.Arrays;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 * 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 * 你可以假设 nums1 和 nums2 不同时为空。
 * <p>
 * 示例 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * 中位数是 2.0
 * <p>
 * 示例 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 中位数是 (2 + 3)/2 = 2.5
 */
class Q0004MedianofTwoSortedArrays {

    /**
     * 排序算法是 N*logN
     */
    double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int[] newarray = new int[total];
        System.arraycopy(nums1, 0, newarray, 0, nums1.length);
        System.arraycopy(nums2, 0, newarray, nums1.length, nums2.length);

        Arrays.sort(newarray);

        int median = total / 2;
        if (total % 2 == 0) {
            return (double) (newarray[median - 1] + newarray[median]) / 2;
        } else {
            return newarray[median];
        }
    }

    double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;

        return 0;
    }
}

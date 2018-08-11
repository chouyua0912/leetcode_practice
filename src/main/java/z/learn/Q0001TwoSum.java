package z.learn;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 利用HashMap数据结构来加快查找
 */
public class Q0001TwoSum {

    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        Integer index;
        for (int i = 0; i < nums.length; i++) {
            if (-1 != (index = map.getOrDefault(Integer.valueOf(target - nums[i]), Integer.valueOf(-1))) && i != index.intValue()) {
                return new int[]{i, index.intValue()};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum3(int[] nums, int target) {
        Integer index;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (-1 != (index = map.getOrDefault(Integer.valueOf(target - nums[i]), Integer.valueOf(-1)))
                    && i != index.intValue()) {
                return new int[]{index.intValue(), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

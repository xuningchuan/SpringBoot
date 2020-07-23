package com.xuningchuan.demo.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xuningchuan
 * @Title: LeetCode1
 * @Description:
 * @date 2020-07-16 19:42
 *
 * question:
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 *  你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *
 *
 *  示例:
 *
 *  给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 *  Related Topics 数组 哈希表
 */
public class LeetCode1 {

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 18;
        System.out.println(Arrays.toString(twoSum(array, target)));

        System.out.println(Arrays.toString(twoSumUseMap(array, target)));


    }

    /**
     *  暴力双循环 时间复杂度 O(n^2)
     *           空间复杂度 O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        throw new RuntimeException("未找到正解");
    }


    /**
     *  一遍循环 使用 map 存储  时间复杂度 O(n)
     *                       空间复杂度 O(n^2)
     *
     *                       用空间换时间
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumUseMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[] {map.get(result), i};
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException("未找到正解");
    }


}

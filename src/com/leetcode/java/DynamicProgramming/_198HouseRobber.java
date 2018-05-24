package com.leetcode.java.DynamicProgramming;

/**
 * 给出一个非负整数的列表，
 * 找出不相邻的整数组合获取最大值
 *
 * 动态规划问题
 * f(0)=0
 * f(1)=nums[0]
 * f(2)=max(nums[0],nums[1])
 * 状态转换方程
 *
 * 递归是从大往小找，dp是从小往大找
 *
 */
public class _198HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int[] f = new int[nums.length];
        f[0] = nums[0];
        if (nums.length == 1) {
            return f[0];
        }
        f[1] = nums[0] > nums[1] ? nums[0] : nums[1];

        if (nums.length == 2) {
            return f[1];
        }
        for (int i = 2; i < nums.length; i++) {
            f[i] = Math.max(f[i - 2] + nums[i], f[i - 1]);
        }
        return f[nums.length - 1];
    }

    // 还可以用new int[3] 作为滚动数组减少空间
}

package com.leetcode.java.Array;

import java.util.Arrays;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 寻找差为K的数组对个数
 *
 * 同时两个指针移动
 *
 * @date 2018/4/23
 */
public class _532KdiffPairsinAnArray {
    public int findPairs(int[] nums, int k) {
        if(k<0 || nums.length<=1){
            return 0;
        }

        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = 1;

        while(right<nums.length){
            int firNum = nums[left];
            int secNum = nums[right];
            if(secNum-firNum<k)
                right++;
            else if(secNum - firNum>k)
                left++;
            else{
                count++;
                while(left<nums.length && nums[left]==firNum){
                    left++;
                }
                while(right<nums.length && nums[right]==secNum){
                    right++;
                }

            }
            if(right==left){
                right++;
            }
        }
        return count;
    }
}

package com.leetcode.java.Array;

import com.leetcode.java.Utils.PrintUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个数组，得出和为特定值的两个数的下标，
 *
 * 假设有解，假设数不重复
 *
 */
public class _01TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int left=target-nums[i];
            if(map.containsKey(left) && map.get(left) != i){
                return new int[]{i,map.get(left)};
            }else {
                continue;
            }
        }
        return new int[]{0,0};
    }

    @Test
    public void test01(){
        int[] nums={3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        PrintUtils.printArray(result);
    }


}

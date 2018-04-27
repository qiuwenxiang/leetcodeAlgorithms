package com.leetcode.java.BitManipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 找出只出现一次的数字
 * @date 2018/4/27
 */
public class _137SingleNumberII {

    public int singleNumber(int[] nums) {
        int one = 0, two = 0;
        for (int i : nums) {
            one = (one ^ i) & ~two;
            two = (two ^ i) & ~one;
        }
        return one;
    }


    public int singleNumber02(int[] nums) {
        //corner case
        if(nums == null || nums.length == 0) return -1;

        int[] bitsCount = new int[32];
        for(int num : nums){
            for(int i = 0; i < 32; i++){
                bitsCount[i] += num & 1;
                num >>>= 1;
            }
        }

        int res = 0;
        for(int i = 31; i >= 0; i--){
            res <<= 1;
            res += bitsCount[i] % 3;
        }
        return res;
    }
    public int singleNumber01(int[] nums) {
        int len = nums.length;
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < len; i++){
            int key = nums[i];
            if (map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }else {
                map.put(key,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() ==1 ){
                result= entry.getKey();
                break;
            }
        }
        return result;
    }
}

package com.leetcode.java.Array;


import com.leetcode.java.Utils.PrintUtils;
import org.junit.Test;

/**
 * 给定两个排序的数组，求出中间的数；
 *
 * 奇数为  最中间
 *
 * 偶数为  中间两个平均
 */
public class _04MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num=nums1.length+nums2.length;
        int[] end=new int[num];
        int i =0;
        int j =0;
        int z=0;
        while ( i+j <= num){
            if (nums1[i]<nums2[i]){
                end[z]=nums1[i];
                i++;
            }else{
                end[z]=nums2[j];
                j++;
            }
            z++;
        }
        PrintUtils.printArray(end);
        return 1;
    }


    @Test
    public void test01(){
        findMedianSortedArrays(new int[]{2,5,6},new int[]{3,4});
    }
}

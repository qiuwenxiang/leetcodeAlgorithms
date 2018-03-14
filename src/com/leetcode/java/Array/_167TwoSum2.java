package com.leetcode.java.Array;


import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 已知一个升序数组array和一个数字s，数组不包含重复数字，在数组中查找两个数，使得它们的和正好为s；
 * 如果有多对数字的和等于s，则全部输出。
 *
 * 为_01TwoSum升级，数组升序之后，首先想到可利用头尾指针分别遍历得出结果
 *
 * Created by lenovo on 2017/6/12.
 */


public class _167TwoSum2 {


    @Test
    public void  test(){
        int[] arr={1,3,4,5,8,9,11};
        find(arr,13);
    }


    @Test
    public void  test01(){
        int[] arr={1,3,4,5,8,9,11};
        find01(arr,13);
    }

    //解法一，两次循环
    public void find(int[] arr,int s){
        int length=arr.length;
        if (length<=1)return;
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                if (arr[i]+arr[j]==s){

                    break;
                }
            }
        }

    }

    //解法二，借助头指针尾指针，相等，i++,j--;小于，i++, 大于，j--
    public void find01(int[] arr,int s){
        int length=arr.length;
        if (length<=1)return;
        int i=0;
        int j=length-1;
        while (i<j){
            int sum=arr[i]+arr[j];
            if (sum==s){
                System.out.println("i:"+arr[i]+"j:"+arr[j]);
                i++;
                j--;
            }else if(sum<s){
                i++;
            }else {
                j--;
            }
        }
    }
    @Test
    public void testTwoSum(){
        int[] arr={3,2,4};
        int target=6;
        int[] result=twoSum(arr,target);
        System.out.println();
    }


    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        if(nums.length<=1){
            return null;
        }
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                result[0]=i;
                result[1]=j;
                i++;
                j--;
            }else if(nums[i]+nums[j]<target){
                i++;
            }else{
                j--;
            }
        }
        return result;
    }

    @Test
    public void testTwoSum01(){
        int[] arr={3,2,4};
        int target=6;
        int[] result=twoSum01(arr,target);
        System.out.println();
    }
    public int[] twoSum01(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    //解法3，借助头指针尾指针，再利用2分查找
    public void find03(int[] arr,int s){
        int length=arr.length;
        if (length<=1)return;
        int i=0;
        int j=length-1;
        int half=j/2;
        while (i<half){
            int sum=arr[i]+arr[half];
            if (sum==s){
                System.out.println("i:"+arr[i]+"j:"+arr[half]);
                i++;
                half=half/2;
            }else if(sum<s){
                half=half*3/2;
            }else {
                half=half/2;
            }
        }
    }
}

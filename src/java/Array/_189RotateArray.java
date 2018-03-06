package java.Array;

import org.junit.Test;

/**
 * leetcode 189题，旋转数组
 * Rotate an array of n elements to the right by k steps.
 * 从右侧旋转一个n个元素的数组，旋转k位
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
 * 解法1：
 *     以中心分割为两个数组，再合并为一新数组
 * 解法2：
 *     将中心分割之后的数据一个一个移到前端
 * 解法3：
 *     以中心分割，各自逆置，再总体逆置
 * 解法4：
 *     总体逆置，以0，k-1逆置，再以k-1到length-1逆置
 * Created by lenovo on 2017/6/9.
 */


public class _189RotateArray {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void rotate01(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k,nums.length-1);
        reverse(nums, 0, nums.length - 1);

    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    @Test
    public void test(){
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr,k);
        for (int o: arr){
            System.out.println(o);
        }
    }

    @Test
    public void test01(){
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotate01(arr,k);
        for (int o: arr){
            System.out.println(o);
        }
    }

}

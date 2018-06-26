package com.leetcode.java.BitManipulation;

/**
 * @description: 统计一个数转二进制后1的个数
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-06-27
 **/
public class _191Numberof1Bits {

    /**
     * 当原数不为0时，将原数与上原数减一的值赋给原数。因为每次减一再相与实际上是将最左边的1给消去了，
     * 所以消去几次就有几个，1消去了最右边的1。
     *
     * 比如  n = XXXXX10000
     *      n-1 =XXXXX01111
     *      n & (n-1) = XXXXX00000
     *      既把最右边的1消去
     *
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0b0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public int hammingWeight01(int n) {
        int mark = 0b1, count = 0;
        // n 为 2进制0时  终止
        while(n != 0b0){
            // 判断最低位是否为1，
            if((n & mark)==0b1){
                count++;
            }
            // 然后无符号右移一位
            n = n >>> 1;
        }
        return count;
    }
}

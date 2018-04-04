package com.leetcode.java.BitManipulation;

/**
 * 位操作
 * @author kylin.qiuwx@foxmail.com
 * @Description: 判断一个数是否是4的幂次方
 *
 * 是2的次方，同时
 *
 *
 * (num & num-1)==0 则是2的次方
 *  2   4   8   16
 *  10  100  1000  10000
 *  1   3   7    15
 *  1   11    111   1111
 *
 *  16进制 0X5555555
 *  = 二进制
 *  1010101010101010101010101010101
 *  4的幂  奇数位 为1
 *  4  16  64
 *  100  10000  1000000
 *  与0X5555555  &  等于本身
 *  按位与运算符（&）
 *  两位同时为“1”，结果才为“1”，否则为0
 *
 *
 *
 * @date 2018/4/4
 */
public class _342PowerofFour {

    public boolean isPowerOfFour(int num) {
        if(num<=0)
            return false;
        return (num & num-1)==0 && (num&0x55555555)==num;
    }
}

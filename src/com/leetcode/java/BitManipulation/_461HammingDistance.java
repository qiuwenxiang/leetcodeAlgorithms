package com.leetcode.java.BitManipulation;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 将两个二进制数比较，输出不同位数的个数
 *
 * 异或运算符作用为“相同出0，不同出1”
 * 31位的数
 *
 * 解法将异或结果一个个移位，然后和  1与&运算，自然相同为1，不同为0，然后用count器加上这个相同的1自然就是“1出现的次数”
 *
 * 1 为 00000001
 * 1 & 1 =1   0&1=0
 * @date 2018/4/25
 */
public class _461HammingDistance {

     public int hammingDistance(int x, int y) {
            int xor = x ^ y, count = 0;
             for (int i=0;i<32;i++) count += (xor >> i) & 1;
            return count;
     }
}

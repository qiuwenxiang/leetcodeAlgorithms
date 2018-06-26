package com.leetcode.java.BitManipulation;

/**
 * @description: 位运算进制转换
 *
 *
 * 十进制转二进制，转八进制，转16进制
 *
 * 一个数 n=1010
 * 每一位  与运算 1  为本身，故 十进制与1 ，再右移一位，将得出数字最终倒序即可
 * 1 & 1 = 1
 * 0 & 1 = 0
 *
 * 八进制  于7 ，移3位
 * 16进制  于15，移4位
 *
 * 比如  十进制 1000，转8进制
 * 1111101000  从右每3位分割， 1 ；  111 = 7 ； 101=5 ； 000 = 0
 * 故8进制 1750
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-06-27
 **/
public class mathToBinary {

    public static String toBinary(int num){
        //定义一个String用于返回得到的二进制
        String binary="";
        //判断接收的数是否为零，是零直接返回零
        if(num==0){
            return "0";
        }
        //判断移位后的数是否为零，为零结束
        while(num!=0){
            //获取每一位
            int bit=num&1;
            //将获取的位添加到字符串
            binary=binary+bit;
            //向右移一位
            num=num>>1;
        }
        //我们获得的二进制是反向的所以通过Stringbuffer工具类把字符串反转
        return new StringBuffer(binary).reverse().toString();

    }



}

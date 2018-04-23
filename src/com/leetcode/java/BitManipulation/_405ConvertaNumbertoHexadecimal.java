package com.leetcode.java.BitManipulation;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 数字转为16进制
 * 就是按位与来获取。既然是得到十六进制，那么每次与上0xF（二进制就是1111），得到一个值，然后数字向右移动4位，
 * 这里需要注意的是数字是有符号的，刚好可以利用Java提供的无符号移动>>>
 * @date 2018/4/23
 */
public class _405ConvertaNumbertoHexadecimal {
    char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

    public String toHex(int num) {
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 0xF)] + result;
            num = (num >>> 4);
        }
        return result;
    }
}

package com.leetcode.java.String;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 翻转一个字符串，借助指针实现
 * @date 2018/4/23
 */
public class _344ReverseString {

    public String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    public String reverseString01(String s) {
        String result = "";
        for (int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }
        return result;
    }
}

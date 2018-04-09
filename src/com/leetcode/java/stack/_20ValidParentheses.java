package com.leetcode.java.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @description: 给定字符串，
 * 包含 '(', ')', '{', '}', '[' and ']' ，判断这个字符串是否有效
 * "(]" and "([)]" are not  不有效
 * 把（ { [  压入一个栈
 * 把 ） } ] 压入另一个栈
 * 最终 pop 相对应  则true
 *
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-04-09
 **/
public class _20ValidParentheses {

    private Stack<Character> before = new Stack<>();
    private Map<Character,Integer> dictionary=new HashMap<Character, Integer>(){{
        put('(',-1);
        put('{',-2);
        put('[',-3);
        put(')',1);
        put('}',2);
        put(']',3);
    }
    };

    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                before.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if(before.isEmpty()){
                    return false;
                }
                if (dictionary.get(before.pop()) + dictionary.get(c) != 0) {
                    return false;
                }
            }
        }
        if (!before.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        _20ValidParentheses obj= new _20ValidParentheses();
        System.out.println(obj.isValid("([])"));
    }
}

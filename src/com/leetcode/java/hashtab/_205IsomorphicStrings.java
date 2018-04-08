package com.leetcode.java.hashtab;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @description: 同构字符串
 * 给定两个字符串 s,t 判定他们是否同构字符串
 * 即一个字符串所有字母替换为另一个字符串的对应位置字母，如果和另一个字符串相等  则返回true
 *
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-04-04
 **/
public class _205IsomorphicStrings {

    /**
     * 有漏掉情况  ab aa   会判断出错
     * @param s
     * @param t
     * @return
     */
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        Set<Character> set=new HashSet<>();

        for(int i=0,j=0;i<s.length();i++,j++){
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            if (map.containsKey(s_char)){
               if(map.get(s_char) != t_char){
                   return false;
               }
            }else {
                // 如果t_char已经参与过映射，下一次又出现在未知映射  即a 对应a, 下一次 b又对应a  false   ac!
                if(set.contains(t_char)){
                    return false;
                }
                map.put(s_char,t_char);
                set.add(t_char);
            }
        }
        return true;
    }
    /**
     * 有漏掉情况  ab aa   会判断出错
     * @param s
     * @param t
     * @return
     */
    public static boolean isIsomorphic01(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        for(int i=0,j=0;i<s.length();i++,j++){
            map.put(s.charAt(i),t.charAt(i));
        }
        String result=s;
        for(Map.Entry<Character,Character> entry:map.entrySet()){
            result=result.replace(entry.getKey(),entry.getValue());
        }
        return t.equals(result);
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab","aa"));
    }
}

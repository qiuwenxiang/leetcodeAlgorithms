package com.leetcode.java.hashtab;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 珠宝和石头，J中字母代表珠宝的类型，得出石头中有多少珠宝的字符串
 * J="aA"   S="aAAbbbbb"   result=3
 *
 * 方法1：S遍历存map,再用J来取
 * 方法2：J遍历 存hashset,遍历S来++
 *
 * @date 2018/4/4
 */
public class _771JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(int i = 0; i < S.length(); i++) {
            String s= String.valueOf(S.charAt(i));
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        int num=0;
        for(int i = 0; i < J.length(); i++) {
            String j=String.valueOf(J.charAt(i));
            if(map.containsKey(j)){
                num += map.get(j);
            }
        }
        return num;
    }


}

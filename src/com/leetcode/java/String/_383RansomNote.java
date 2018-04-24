package com.leetcode.java.String;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 题目叫做Ransom Note，勒索信，刚开始我还没理解这个题目的意思，尤其这个标题，和magazine有啥关系呢？
 * 后来仔细想想，才慢慢理解。勒索信，为了不暴露字迹，就从杂志上搜索各个需要的字母，组成单词来表达的意思。
 * 这样来说，题目也就清晰了，判断杂志上的字是否能够组成勒索信需要的那些字符。
 * 这里需要注意的就是杂志上的字符只能被使用一次，不过不用考虑大小写的问题。
 * 将magazine 的字母次数记录下来
 * 'a'-'a'=0   a=97
 *
 * @date 2018/4/24
 */
public class _383RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _383RansomNote o=new _383RansomNote();
        o.canConstruct("adbdsad","dsadadadasdad");
    }
}

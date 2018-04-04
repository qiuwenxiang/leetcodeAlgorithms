package com.leetcode.java.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 自除整数，能被每位整除不含0
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-04-04
 **/
public class _728SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=left;i<=right;i++){

            int j = i;
            for (;j > 0 ;j= j/10 ) {
                if( (j%10==0 )|| (i%(j%10))!=0) break;
            }
            if(j==0) result.add(i);

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(1/10);
    }
}

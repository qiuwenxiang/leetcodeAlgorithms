package com.leetcode.java.stack;

/**
 * @description: 棒球计分
 * 整数（一个圆的分数）：直接代表你在这个回合中得到的点数。

 * “+”（一轮得分）：代表你在这一轮中得到的分数是最后两个有效回合的分数之和。

 * “D”（一轮得分）：代表你在这一轮中得到的分数是最后一轮有效点的双倍数据。

 * “C”（一个操作，不是圆的分数）：表示你得到的最后一轮有效点无效，应该去掉。

 * 每一轮的操作都是永久性的，对回合前和回合后都有影响。

将 + D C 转换为分数


你需要在所有回合中返回你能得到的分数的总和。
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-04-09
 **/
public class _682BaseballGame {
    public int calPoints(String[] ops) {
        //给定字符串数组，每个对应的关系如题上所述，你需要返回最后的得分之和
        //思路：使用数组实现
        if (ops.length == 0) return 0;

        int sum = 0;
        int[] nums = new int[ops.length];
        //和数组中的游标
        int index = 0;
        for (int i = 0; i < ops.length; i++) {
            //取第一个符号
            char op = ops[i].toCharArray()[0];
            switch (op) {
                case '+':
                    //两和相加
                    int numP=nums[index - 1] + nums[index - 2];
                    nums[index++] = numP;
                    break;
                case 'D':
                    int numD=nums[index-1]*2;
                    nums[index++] = numD;
                    break;
                case 'C':
                    nums[--index] = 0;
                    break;
                default:
                    //数字
                    nums[index++] = Integer.parseInt(ops[i]);
                    break;
            }
        }
        //将结果求和
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
        }

        return sum;
    }
}

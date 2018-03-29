package com.leetcode.java.tree;

import java.util.HashSet;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 两个数的和，其中一个为二叉树
 * 给定一个二叉树和一个值，若2叉树中有两个和为值 返回ture
 * 思路
 *   ： 遍历二叉树的值，放于一个Set,比较
 *
 *
 * @date 2018/3/29
 */
public class _653TwoSumIVInputisaBST {
    public boolean findTarget(TreeNode root, int k) {

        return find(root,new HashSet<Integer>(),k);

    }

    public boolean find(TreeNode root, HashSet<Integer> mem, int k){
        if (root == null) return false;
        if (mem.contains(k - root.val)) return true;
        mem.add(root.val);
        return find(root.left, mem, k) || find(root.right, mem, k);
    }

}

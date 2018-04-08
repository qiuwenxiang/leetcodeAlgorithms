package com.leetcode.java.tree;

/**
 * @description: 给定一个二叉树，计算树的直径长度；定义为两个节点最长路径
 *
 * 遍历每一个节点，保存最大长度
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-04-08
 **/
public class _543DiameterofBinaryTree {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return diameter;
    }

    public int getDepth(TreeNode root){
        if (root == null)
            return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        int temp = left + right;
        if (temp > diameter)
            diameter = temp;
        return Math.max(left, right) + 1;
    }
}

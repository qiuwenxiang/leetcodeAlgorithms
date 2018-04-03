package com.leetcode.java.tree;

/**
 * @description: 给定一个二叉树，转换为一个更大的二叉树
 *
 * 5 2 13  转为 18 20 13  先处理右节点，然后自身，最后左节点
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-03-30
 **/
public class _538ConvertBSTtoGreaterTree {

    int sum=0;

    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }
        sum=0;
        convert(root);
        return root;
    }

    public void convert(TreeNode root){
        if(root == null) return;

        convert(root.right);

        root.val = sum + root.val;
        sum = root.val;
        convert(root.left);
    }
}

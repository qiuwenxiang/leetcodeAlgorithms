package com.leetcode.java.tree;

/**
 * @description: 合并两个二叉树
 *
 * 首先想到：把数转为数组，两个数组合并，最后还原为数
 *
 * 二：
 *   两个数合并 = 最终他们的根值想加，左子树的左子树合并，右子树=右子树横
 *
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-03-29
 **/
public class _617MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 ==null){
            return null;
        }
        if (t1 == null && t2 != null){
            return t2;
        }
        if (t1 != null && t2 == null){
            return t1;
        }
        t1.val+=t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;

    }
}

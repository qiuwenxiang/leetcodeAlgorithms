package com.leetcode.java.tree;

/**
 *  求解一个二叉树的最大深度
 *  比如[3,9,20,null,null,15,7]
 *      3
 *    9   20
 *       15 7
 *  左子树为 [9]  右子树为[20,15,7]
 *  二叉树的最大深度 = 左子树深度>右子树深度？（左子树+1）：(右子树+1)
 *
 *
 * Created by lenovo on 2018/3/29.
 */


public class _104MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? (leftDepth+1): (rightDepth+1);
    }
}

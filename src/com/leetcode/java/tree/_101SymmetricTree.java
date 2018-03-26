package com.leetcode.java.tree;

/**
 * 给定一个二叉树，判断其是否对称
 * 递归比较左数左节点等于右树右节点
 */
public class _101SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return isSymmetric(root.left,root.right);
    }


    public boolean isSymmetric(TreeNode l,TreeNode r){
        if(l==null && r==null)
            return true;
        if(l==null || r==null)
            return false;
        if(l.val==r.val)
            return isSymmetric(l.left,r.right) && isSymmetric(l.right,r.left);
        return false;
    }
}

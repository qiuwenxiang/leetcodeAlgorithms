package com.leetcode.java.tree;

/**
 * 判断两个树是否相等，非空判断之后，左子树分别相等，右字数分别相等
 */
public class _100SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null){
            return true;
        }else if(p!=null && q==null){
            return false;
        }else if(p==null && q!=null){
            return false;
        }else{
            return (p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right) ;
        }

    }
}

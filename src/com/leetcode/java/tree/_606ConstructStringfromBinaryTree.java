package com.leetcode.java.tree;

/**
 * @description: 前序遍历构造字符串
 * 主要是观察
 * [1,2,3,4]
 *
 * 1(2(4))(3)
 *
 *t.val+"("+tree2str(t.left)+")("+tree2str(t.right)+")";
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-03-30
 **/
public class _606ConstructStringfromBinaryTree {

    public String tree2str(TreeNode t) {
        if(t ==null){
            return null;
        }
        if(t.left == null && t.right ==null){
            return t.val+"";
        }
        if(t.right==null)
            return t.val+"("+tree2str(t.left)+")";
        return t.val+"("+tree2str(t.left)+")("+tree2str(t.right)+")";

    }
}

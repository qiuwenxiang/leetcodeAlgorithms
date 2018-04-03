package com.leetcode.java.tree;

import com.leetcode.java.Utils.CreateBinaryTree;

/**
 * @description: 获取左子树的所有值
 *
 * 等于左子树的值  加   右子树的值
 *
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-03-30
 **/
public class _404SumofLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null)
            return 0;
        if (root.left != null && root.left.right == null
                && root.left.left == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    public static void main(String[] args) {
        Integer[] arr={-9,-3,2,null,4,4,0,-6,null,-5};

        TreeNode treeNode = CreateBinaryTree.arrayToBinaryTree(arr, null);
        _404SumofLeftLeaves obj=new _404SumofLeftLeaves();
        System.out.println(obj.sumOfLeftLeaves(treeNode));
    }
}

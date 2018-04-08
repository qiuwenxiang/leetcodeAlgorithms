package com.leetcode.java.tree;

import com.leetcode.java.Utils.CreateBinaryTree;

/**
 * @description: 算出一个二叉树的倾斜
 *
 * 树的倾斜度定义为所有节点的倾斜度之合
 *
 * 节点的倾斜度定义为  左树的所有值与右树所有值差的绝对值
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-03-30
 **/
public class _563BinaryTreeTilt {

    int sum=0;

    public int findTilt(TreeNode root) {
        // 1. 对于基本类型，在方法体内对方法参数进行重新赋值，并不会改变原有变量的值。
        postOrder(root);
        return sum;
    }


    public int postOrder(TreeNode node) {
        if (node == null) return 0;
        int left=postOrder(node.left);
        int right = postOrder(node.right);

        sum += Math.abs(left-right);
        return left + right + node.val;
    }


    public static void main(String[] args) {
        _563BinaryTreeTilt t=new _563BinaryTreeTilt();
        Integer[] arr={1,2,3};

        TreeNode treeNode = CreateBinaryTree.arrayToBinaryTree(arr, null);
        System.out.println(t.findTilt(treeNode));
    }
}

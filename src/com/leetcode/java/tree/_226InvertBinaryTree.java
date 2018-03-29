package com.leetcode.java.tree;

/**
 *  @Description: 反转一个二叉树
 *     4                      4
 *  2     7       变为     7     2
 *1   3   6  9           9  6    3   1
 * 观察得结果，最终
 * root.left  7    是root.right  7    反转而来
 *          9  6                6   9
 *
 * @author kylin.qiuwx@foxmail.com
 * @date 2018/3/29
 */
public class _226InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        if(root.left ==null && root.right != null){
            root.left = invertTree(root.right);
            root.right = null;
            return root;
        }
        if(root.left !=null && root.right == null){
            root.right = invertTree(root.left);
            root.left = null;
            return root;
        }
        TreeNode tmp=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(tmp);
        return root;

    }
}

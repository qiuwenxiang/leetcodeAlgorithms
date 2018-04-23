package com.leetcode.java.tree;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 找二叉搜索树两节点之间最小值
 * 中序遍历所得的值递增的
 * @date 2018/4/23
 */
public class _530MinimumAbsoluteDifferenceinBST {
    int min = Integer.MAX_VALUE;
    int pre = -1;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        getMinimumDifference(root.left);
        if (pre != -1) {
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        getMinimumDifference(root.right);
        return min;
    }


}
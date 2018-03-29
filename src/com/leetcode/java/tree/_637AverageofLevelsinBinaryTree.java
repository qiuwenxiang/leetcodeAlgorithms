package com.leetcode.java.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ceshi
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 *    求出一个二叉树每层的平均值，与107打印每层数组相通，再加一步计算即可
 * @date 2018/3/29
 */
public class _637AverageofLevelsinBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new LinkedList<Double>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null)
            return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            int num = queue.size();
            List<Integer> levelList = new LinkedList<Integer>();
            double sum = 0;
            for(int i = 0; i < num; i++){
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                sum+=queue.poll().val;
            }

            list.add(sum/num);
        }
        return list;
    }
}

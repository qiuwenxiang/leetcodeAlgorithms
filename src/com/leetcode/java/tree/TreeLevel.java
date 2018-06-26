package com.leetcode.java.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-06-26
 **/
public class TreeLevel {


    public static int getLevel(TreeNode node){
        int level = 0;
        if (node == null){
            return level;
        }
        if (node.left == null && node.right == null){
            return ++level;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            int len = queue.size();
            level++;
            for (int i=0;i<len;i++){
                TreeNode tmp = queue.poll();
                if(tmp.left!=null){
                    queue.add(tmp.left);
                }
                if(tmp.right!=null){
                    queue.add(tmp.right);
                }

            }

        }
        return level;
    }

}

package com.leetcode.java.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树 反转层序遍历
 *
 * 两个关键点：
 * 1.借助 new linkedList.add(0,element) 方法，可以把最后数据插在最前位置
 * 2.数据怎么界定分层：
 *    每次循环，取得当前queue长度，通过for循环poll拉出数据，插入的时候，使用peek 返回头元素 不删除
 *
 *
 * Created by lenovo on 2018/3/29.
 */


public class _107BinaryTreeLevelOrderTraversalII {


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null)
            return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            int num = queue.size();
            List<Integer> levelList = new LinkedList<Integer>();
            for(int i = 0; i < num; i++){
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                levelList.add(queue.poll().val);
            }

            list.add(0, levelList);
        }
        return list;

    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(0,1);
        list.add(0,2);
        list.add(0,3);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();

        list1.add(0,1);
        list1.add(0,2);
        list1.add(0,3);

        list.add(4);
        System.out.println(list1);




    }


}

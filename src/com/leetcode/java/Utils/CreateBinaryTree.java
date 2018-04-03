package com.leetcode.java.Utils;

import com.leetcode.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 根据数组创建二叉树
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-03-30
 **/
public class CreateBinaryTree {

    public static TreeNode arrayToBinaryTree(Integer[] array, String nullValue){
        if(array==null||array.length==0){
            return null;
        }else{
            List<TreeNode> tempList=new ArrayList<TreeNode>();
            TreeNode root=new TreeNode(array[0]);
            tempList.add(root);
            int index=1;
            loop:
            while(tempList.size()>0&&index<array.length){
                List<TreeNode> newList=new ArrayList<TreeNode>();
                for(TreeNode node:tempList){
                    if(index==array.length){
                        break loop;
                    }
                    if(array[index]!=null&&!array[index].equals(nullValue)){
                        node.left=new TreeNode(array[index]);
                        newList.add(node.left);
                    }
                    index++;
                    if(index==array.length){
                        break loop;
                    }
                    if(array[index]!=null&&!array[index].equals(nullValue)){
                        node.right=new TreeNode(array[index]);
                        newList.add(node.right);
                    }
                    index++;
                }
                tempList=newList;
            }
            return root;
        }
    }

}

package com.leetcode.java.LinkedList;


/**
 * @description: 在一个linkedList中删除一个节点
 *
 * 给定要被删除的点
 * 则把  值与后一个节点切换
 * 再把  next指向next.next
 *
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-04-03
 **/
public class _237DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

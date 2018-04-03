package com.leetcode.java.LinkedList;

import java.awt.print.Printable;

/**
 * @description: 反转linklist
 * 假设为1-2-3-4
 *
 * 反转为4-3-2-1
 *
 * 创建1 ，1的next 为空
 *    创建2，把1赋给2的next
 *      创建3，把2赋给3的next
 *
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-04-03
 **/
public class _206ReverseLinkedList {

    // 循环
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    //递归 1-2-3-4   等于把  递归 node.next ，生成的node.next 指向自己
    public static ListNode reverseList01(ListNode head) {
        if (head ==null){
            return null;
        }
        if (head.next ==null){
            return head;
        }
        ListNode cur = head;
        ListNode next = reverseList01(head.next);
        cur.next=null;

        next.next=cur; // next.last
        return next;
    }

    public static void main(String[] args) {
        ListNode node= new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(4);
        node.next=node2;
        node2.next=node3;
        node3.next=node4;

        ListNode listNode = reverseList01(node);
        System.out.println(listNode.toString());

    }
}

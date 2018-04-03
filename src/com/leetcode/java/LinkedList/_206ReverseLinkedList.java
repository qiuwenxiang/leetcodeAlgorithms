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

    //递归 1-2-3-4   等于把  递归 node.next ，生成的node.next 的最后一位的next 指向自己 accept,不简洁
    public static ListNode reverseList01(ListNode head) {
        if (head ==null){
            return null;
        }
        if (head.next ==null){
            return head;
        }
        ListNode cur = head;
        ListNode p=head.next;
        ListNode next = reverseList01(p);
        cur.next=null;
        //next的最后一个节点的next 指向cur
        ListNode x=next;
        while (x.next!=null){
            x = x.next;
        }
        x.next=cur;

       // next.next=cur; // next.last
        return next;
    }


    //递归 1-2-3-4
    // 考虑最后一级   head.val=3 ,res的地址于head.next地址相同 ，故nextNode.next = head  组成4,-》3,4,3,4 然后head.next为空 得到4，3

    public static ListNode reverseList02(ListNode head) {
        if (head ==null){
            return null;
        }
        if (head.next ==null){
            return head;
        }
        ListNode nextNode = head.next;
        ListNode res = reverseList02(head.next);
        // nextNode.next 与 res的最后一级为同地址
        nextNode.next=head;
        head.next=null;

        // next.next=cur; // next.last
        return res;
    }

    public static void main(String[] args) {
        ListNode node= new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(4);
        node.next=node2;
        node2.next=node3;
        node3.next=node4;

        ListNode listNode = reverseList02(node);
        System.out.println(listNode.toString());

    }
}

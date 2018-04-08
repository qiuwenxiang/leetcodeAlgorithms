package com.leetcode.java.LinkedList;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 移除linkedList中重复项
 * 递归，，比较麻烦
 *
 * 循环可以做
 *
 *
 * @date 2018/4/8
 */
public class _83RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next ==null){
            return head;
        }

        head.next=deleteDuplicatesThen(head.val,head.next);
        return head;

    }

    public ListNode deleteDuplicatesThen(int val,ListNode next){
        if(next == null){
            return null;
        }
        if(val == next.val){
            return deleteDuplicatesThen(val,next.next);
        }else{
            ListNode pre=next;
            pre.next = deleteDuplicatesThen(next.val,next.next);
            return pre;
        }
    }
}

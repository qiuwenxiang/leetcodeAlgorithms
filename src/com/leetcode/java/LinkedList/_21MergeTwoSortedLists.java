package com.leetcode.java.LinkedList;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 合并两个排序过的linked_list
 *
 * 两个list的头结点比较
 *
 * 最终得到List分为  head  和next ,next 为（l1,l2.next） 或（l1.next,l2）
 *
 *
 * @date 2018/4/8
 */
public class _21MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val > l2.val) {
            ListNode tmp = l2;
            tmp.next = mergeTwoLists(l1, l2.next);
            return tmp;
        } else {
            ListNode tmp = l1;
            tmp.next = mergeTwoLists(l1.next, l2);
            return tmp;
        }
    }
}

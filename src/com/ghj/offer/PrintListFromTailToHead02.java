package com.ghj.offer;

import java.util.ArrayList;

/**
 * 头插法
 */
public class PrintListFromTailToHead02 {
    public ArrayList<Integer> printListFromTailToHead02(ListNode listNode){
        // 头插法构建逆序链表
        ListNode head = new ListNode(-1);
        while (listNode != null){
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }

        //构建ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (ret != null){
            ret.add(head.value);
            head = head.next;
        }
        return ret;
    }
    private class ListNode {
        private int value;
        private ListNode next;
        public ListNode(int data){
            this.value = data;
        }
    }
}

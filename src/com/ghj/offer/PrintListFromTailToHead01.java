package com.ghj.offer;

import java.util.ArrayList;

/**
 * 从尾到头反过来打印出每个结点的值
 *
 * 一共有三种方法，接下来回一一给出
 * 分别是: 递归的方法，头插法，借助栈
 */
public class PrintListFromTailToHead01 {
    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int data) {
            this.value = data;
        }
    }
    public ArrayList<Integer> printListFromTailToHead01(ListNode listNode){
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null){
            ret.addAll(printListFromTailToHead01(listNode.next));
            ret.add(listNode.value);
        }
        return ret;
    }


}

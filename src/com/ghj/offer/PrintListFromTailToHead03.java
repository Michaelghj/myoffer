package com.ghj.offer;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead03 {
    public ArrayList<Integer> printListFromTailToHead03(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.add(listNode.value);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty()){
            ret.add(stack.pop());
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

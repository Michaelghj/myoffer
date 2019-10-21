package com.ghj.offer;

import java.util.Stack;

/**
 * 用两个栈实现一个队列
 * 完成队列的pop 和 push方法
 */
public class Solution {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();
    //进入队列
    public void push(int node){
        in.push(node);
    }
    //出队列
    public int pop()throws Exception{
        if (out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
        if (out.isEmpty()){
            throw  new Exception("Queue is null");
        }
        return out.pop();
    }
}

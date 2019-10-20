package com.ghj.recursion;

/**
 * 这是一个面试笔试特别常见的题 上楼梯
 * 一次可以上1阶或者2阶台阶
 * 问：可以有多少种上台阶的方法
 */
public class ClimbStairs {
    /**
     * 递归的方法
     * @param n
     * @return
     */
    public static int climbStairs(int n){
        if (n == 1 || n == 2){
            return n;
        }
      return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /**
     * 非递归的方法
     * @param
     */
    public static int climbStairs2(int n){
        if (n <= 2) {
            return n;
        }
        int pre2 = 1, pre1 = 2;
        for (int i = 2; i < n; i++) {
            int cur = pre1 + pre2;
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(30));
        System.out.println(climbStairs2(30));
    }

}

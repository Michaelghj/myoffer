package com.ghj.offer;

/**
 * 1. 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。
 * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法
 *
 * 2. 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级... 它也可以跳上 n 级。
 * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法
 *
 * 用动态规划去写 还没学这个继续努力
 */
public class JumpFloor {
    //
    public int jumpFloor(int n){
        if (n  <= 1){
            return n;
        }
        int pre2 = 0;
        int pre1 = 1;
        int result = 1;

        for (int i = 2; i < n;i++){
            result = pre1 + pre2;
            pre2 = pre1;
            pre1 = result;
        }

        return result;
    }

}

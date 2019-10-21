package com.ghj.offer;

/**
 * 斐波那契数列
 */
public class Fibonacci {
    /**
     * 空间复杂度O(n)
     * @param n
     * @return
     */
    public int fibonacci01(int n){
        if (n==1||n==2){
            return n;
        }
        return fibonacci01(n-1) + fibonacci01(n-2);
    }

    /**
     * 空间复杂度O(1)
     * @param n
     * @return
     */
    public int fibonacci02(int n){
        if (n <=  1){
            return n;
        }
        int pre2 = 0;
        int pre1 = 1;
        int fib = 0;

        for (int i = 2;i <= n;i++){
            fib = pre1  + pre2;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }

    /**
     * 由于待求解的 n 小于 40，因此可以将前 40 项的结果先进行计算，之后就能以 O(1) 时间复杂度得到第 n 项的值。
     * 时间复杂度是O（1）
     * @return
     */
    private int[] fib = new int[40];
    public int fibonacci03(int n){
        if (n <= 1){
            return n;
        }
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}

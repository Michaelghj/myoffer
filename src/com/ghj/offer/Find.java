package com.ghj.offer;

public class Find {
    public boolean find(int target, int[][] matrix){
        if (matrix  == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        //行
        int rows = matrix.length;
        //列
        int cols = matrix[0].length;
        //从右上角开始查询
        int r = 0;
        int c = cols - 1;
        while (r <= rows - 1 && c >= 0){
            if (target == matrix[r][c]){
                return true;
            }else if(target > matrix[r][c]){
                r++;
            }else {
                c--;
            }
        }
        return false;
    }
}

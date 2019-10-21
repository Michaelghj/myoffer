package com.ghj.sort;

/**
 * 选择排序
 */
public class Selection {
    public void selection(int[] arr){
        if (arr ==  null || arr.length < 2){
            return;
        }
        int minIndex = 0;
        for (int i  = 0; i < arr.length -  1; i++){
            for (int j = i + 1; j < arr.length - 1; j++){
                if (arr[j] < arr[i]){
                    minIndex = j;
                }
                swap(arr, minIndex, j);
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

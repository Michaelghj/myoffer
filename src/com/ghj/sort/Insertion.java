package com.ghj.sort;

/**
 * 插入排序
 */
public class Insertion {
    public void insertion(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i; arr[j - 1] > arr[j] && j > 0; j--) {
                swap(arr, j - 1, j);
            }
        }
    }

    private void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}

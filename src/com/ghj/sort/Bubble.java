package com.ghj.sort;

public class Bubble {
    public void bubbleSort(int[] arr){
        if (arr == null|| arr.length < 2){
            return;
        }
        for (int end = arr.length-1; end > 0; end--){
            for (int j = 0; j <= end; j--){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}

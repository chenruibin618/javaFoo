package com.crb.javafoo.sorting;

public class SelectionSort {

    public static int[] sorting(int[] inputArr){

        for(int i=0;i<inputArr.length-1;i++){
            int min = i+1;
            for(int j=i+1;j<inputArr.length-1;j++){
                if(inputArr[min] > inputArr[j+1]){
                    min = j+1;
                }
            }
            if(inputArr[i] > inputArr[min]){
                int tmp = inputArr[min];
                inputArr[min] = inputArr[i];
                inputArr[i] = tmp;
            }

        }

        return inputArr;
    }

}

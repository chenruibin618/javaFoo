package com.crb.javafoo.sorting;

/**
 * 冒泡排序
 * See {@linktourl https://zh.wikipedia.org/wiki/%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F}
 */
public class BubbleSort {

    public static int[] sorting(int[] inputArr){

        for(int i=0;i<inputArr.length;i++){

            for(int j=0;j<inputArr.length-i-1;j++){

                if(inputArr[j] > inputArr[j+1]){
                    int tmp = inputArr[j];
                    inputArr[j] = inputArr[j+1];
                    inputArr[j+1] = tmp;
                }

            }

        }

        return inputArr;
    }
}

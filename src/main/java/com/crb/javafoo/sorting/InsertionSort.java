package com.crb.javafoo.sorting;

/**
 * 插入排序
 * See {@linktourl https://zh.wikipedia.org/wiki/%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F}
 */
public class InsertionSort {

    public static int[] sorting(int[] inputArr){


        for(int i=0;i<inputArr.length;i++){

            for(int j=i;j>0;j--){

                if(inputArr[j-1] > inputArr[j]){
                    int tmp = inputArr[j];
                    inputArr[j] = inputArr[j-1];
                    inputArr[j-1] = tmp;
                }

            }

        }

        return inputArr;
    }
}

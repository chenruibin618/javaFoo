package com.crb.javafoo;

import com.crb.javafoo.sorting.BubbleSort;
import com.crb.javafoo.sorting.InsertionSort;
import com.crb.javafoo.sorting.SelectionSort;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SortingTest {

    Logger logger = LoggerFactory.getLogger(SortingTest.class);

    private void showArr(int[] inputArr){
        StringBuilder sb = new StringBuilder();
        for(Object obj:inputArr){
            sb.append(obj + ",");
        }
        String output = sb.substring(0,sb.length()-1);
        logger.info(output);
    }

    @Before
    @After
    public void before(){
        logger.info("---------------------------------------------");
    }

    private static int[] arr;

    @BeforeClass
    public static void init(){
        arr = new int[]{1, 4, 5, 2, 10, 4, 9, 0, 6, 7, 3};
    }

    @Test
    public void bobbleSort(){
        showArr(arr);
        int[] result = BubbleSort.sorting(arr);
        showArr(result);
    }

    @Test
    public void InsertionSort(){
        showArr(arr);
        int[] result = InsertionSort.sorting(arr);
        showArr(result);
    }

    @Test
    public void SelectionSort(){
        showArr(arr);
        int[] result = SelectionSort.sorting(arr);
        showArr(result);
    }

}

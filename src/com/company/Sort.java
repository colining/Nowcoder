package com.company;

import Sword.Offer.Thirty.Quicksort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by asus on 2017/4/13.
 */
public class Sort {
    public  static void  main(String [] arg)
    {
        int [] array = {1,2,1,0,1,3,2,5};
//        pop(array);
//        select(array);
//        insert(array);
        quicksort(array,0,array.length-1);
//        Quicksort.quick_sort1(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    static public void pop(int [] array)
    {
        for (int i = 0; i < array.length-1; i++) {
            for (int i1 = 0; i1 < array.length-1-i; i1++) {
                if (array[i1]>array[i1+1])
                {
                    int temp = array[i1];
                    array[i1] = array[i1+1];
                    array[i1+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    static public void select(int [] array)
    {
        int min = 0;
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[min]>array[j])
                    min = j;
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    static public void insert(int [] array)
    {
        for (int i = 1; i < array.length; i++) {
            int j =0;
            int temp=0;
            if (array[i-1]>array[i])
            {
                 temp= array[i];
                for (j = i-1;j>=0&&array[j]>temp;j--)
                    array[j+1] = array[j];

            array[j+1] =temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    static int Partition(int date [] , int left , int right)
    {
        int left1 = left;
        int key = date[left1];
        while (left<right)
        {
            while (left<right&&date[right]>= key)
                --right;
            swap(date,left,right);
            while (left<right&&date[left]<key)
                ++left;
            swap(date,left,right);
        }
        //date[left]=key;
        return left;
    }
    static void quicksort(int date [] , int start , int end)
    {

        if (start<end)
        {
            int index = Partition(date, start, end);
            quicksort(date,start,index-1);
            quicksort(date,index+1,end);
        }
    }
    static void swap(int date[] , int i , int j )
    {
        int temp = date [i];
        date[i] = date[j];
        date[j] = temp;
    }
}

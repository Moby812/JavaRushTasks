package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
В убывающем порядке
Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int[] array = new int[20];
        int[] array = {4,6,8,3,9,3,0,-6,54,13};
//        for (int i = 0; i < 20; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
//        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код

        for (int i = array.length-1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                if (array[j] > array[j-1]) {
                int tmp = array[j-1];
                array[j-1] = array[j];
                array [j] = tmp;
                }
            }
        }
    }
}

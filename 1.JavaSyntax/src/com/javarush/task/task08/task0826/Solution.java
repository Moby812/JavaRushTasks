package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
1. Создать массив на 20 чисел.
2. Заполнить его числами с клавиатуры.
3. Вывести пять наибольших чисел.
4. Каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];                                  //step 1
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());         //step 2
        }

        sort(array);                                                                                                    //сортируем на уменьшение

        System.out.println(array[0]);                               //step 3\4
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код


    }
}

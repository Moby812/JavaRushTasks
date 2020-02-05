package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

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
//        int[] array = {2,6,7,1,0,23,18};           // TODO: 2020-02-05 Временная заглушка
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
//    public static void sort(Integer[] array) {
        //напишите тут ваш код
//        Arrays.sort(array);                                     //быстрая прямая сортировка

//        Arrays.sort(array, Collections.reverseOrder());         //быстрая обратная сортировка работает только с типом переменной Integer

        for (int i = array.length-1; i > 0; i--) {                 //сортировка пузырьком
            for (int j = 0; j < i; j++) {
                int tmp;
                if (array[j] < array[j+1]) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}

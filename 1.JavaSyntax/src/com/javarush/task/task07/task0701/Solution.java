package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();                                        //массив array = массиву num
        int max = max(array);                                                   //переменная max = переменной max из метода max
        System.out.println(max);

    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[20];                                                            //создаём массив num с 20-тью ячейками
        for (int i = 0; i < num.length; i++) {                                      //перебираем поочереди ячейки массива
            int readerNum = Integer.parseInt(reader.readLine());                    //считываем значения с клавы
            num[i] = readerNum;                                                             //заполняем ячейки массива значениями
        }
        return num;                                                                         //возвращаем массив num
    }

    public static int max(int[] array) {                                                    //на вход принимаем массив int[] array
        // найди максимальное значение
        int max = Integer.MIN_VALUE;                                                        //указываем минимально возможное значение для int
        for (int i = 0; i < array.length; i++) {                                    //перебираем поочереди ячейки массива
            if (array[i] > max)                                                     //сравниваем значение в ячейке и max
                max = array[i];
        }
        return max;                                                                         //возвращаем переменную max
    }
}

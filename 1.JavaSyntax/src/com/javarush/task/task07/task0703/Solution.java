package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] str = new String[10];
        int[] num = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < str.length; i++) {
        String text = reader.readLine();
        str[i] = text;
        }

        for (int i = 0; i < str.length ; i++) {
            String xer = str[i];
            num[i]=xer.length();
        }

        for (int value : num) System.out.println(value);
//        for (int i = 0; i < num.length ; i++) System.out.println(num[i]);
    }
}

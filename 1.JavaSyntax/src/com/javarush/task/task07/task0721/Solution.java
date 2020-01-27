package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах

Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //напишите тут ваш код
        int[] number = new int[20];

        for (int i = 0; i <number.length ; i++) number[i] = Integer.parseInt(reader.readLine());


        for (int value : number) {
            if (value > maximum) maximum = value;
            else if (value < minimum) minimum = value;

//        for (int i = 0; i <number.length ; i++) {
//            if (number[i] > maximum) maximum = number[i];
//            else if (number[i] < minimum) minimum = number[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}

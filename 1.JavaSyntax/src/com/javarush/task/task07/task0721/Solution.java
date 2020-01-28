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

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] number = new int[20];

        for (int i = 0; i < number.length; i++) number[i] = Integer.parseInt(reader.readLine());

        for (int i = number.length - 1; i > 0; i--) { // максимальное число помещаем в самый конец.
            for (int j = 0; j < i; j++) { // начинаем поиск максимального числа.
                if (number[j] > number[j + 1]) { // сравниваем ближайшие значения.
                    // меняем их местами
                    int tmp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = tmp;
                }
            }
        }

        minimum = number[0];
        maximum = number[number.length - 1];

        System.out.print(maximum + " " + minimum);
    }
}

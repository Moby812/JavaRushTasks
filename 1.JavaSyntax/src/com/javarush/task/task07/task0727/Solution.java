package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
Программа выводит содержимое нового списка на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();        //создаём список
        while (true) {
            String string = reader.readLine();                 //считываем с клавы
            if (string == null || string.isEmpty()) break;     //если считали пустую строку то прекращаем
            strings.add(string);                               //добавляем строку в список
        }

        ArrayList<String> resultStrings = new ArrayList<String>();  //второй список
        for (int i = 0; i < strings.size(); i++) {              //перебираем первый список
            if (strings.get(i).length() %2 == 0) {
                resultStrings.add(strings.get(i));
                resultStrings.add(strings.get(i));
            } else {
                resultStrings.add(strings.get(i));
                resultStrings.add(strings.get(i));
                resultStrings.add(strings.get(i));
            }
//            String string = strings.get(i);                     //переносим значение ячейки списка в переменную
//            resultStrings.add(string.toUpperCase());            //в новый список добавляем строку в вернем регистре
        }

        for (int i = 0; i < resultStrings.size(); i++) {        //выводим весь список на экран
            System.out.println(resultStrings.get(i));
        }
    }
}

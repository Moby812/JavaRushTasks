package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые

1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) strings.add(i, reader.readLine());     //заполняем лист строками с клавы
        int minSize = Integer.MAX_VALUE;
        int maxSize = 0;


        for (String string : strings) {
            int size = string.length();
            if (minSize > size) minSize = size;
            if (maxSize < size) maxSize = size;
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == minSize) {
                System.out.print(strings.get(i));
                break;
            }
            if (strings.get(i).length() == maxSize) {
                System.out.print(strings.get(i));
                break;
            }
        }
    }
}
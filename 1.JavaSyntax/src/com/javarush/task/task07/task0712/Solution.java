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

        for (int i = 0; i < 4; i++) strings.add(i, reader.readLine());     //заполняем лист строками с клавы
        // TODO: 26.01.2020 временно сделаю счётчик на 4 строки
        int minSize = Integer.MAX_VALUE;
        int maxSize = 0;

        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                int size = strings.get(j).length();
                if (minSize > size) minSize = size;
                if (maxSize < size) maxSize = size;
            }
//            if (minSize == strings.get(i).length()) System.out.println(strings.get(i));
//            if (maxSize == strings.get(i).length()) System.out.println(strings.get(i));
        }
        System.out.println(minSize);
        System.out.println(maxSize);
    }
}

package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
3. Выведи результат на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) list.add(i, reader.readLine()); // TODO: 26.01.2020 10

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        System.out.println(result);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i));
            i++;
        }
        System.out.println();

        return list;
    }
}

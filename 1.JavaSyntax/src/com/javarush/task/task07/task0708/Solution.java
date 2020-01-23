package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String text = reader.readLine();
            strings.add(i, text);
        }

        int max = 0;
        for (int i = 0; i < strings.size(); i++) {

            for (int j = 0; j < strings.size(); j++) {
                int sizeText = strings.get(j).length();
                if (sizeText >= max) max = sizeText;
            }
            if (strings.get(i).length() == max) System.out.println(strings.get(i));
        }
    }
}

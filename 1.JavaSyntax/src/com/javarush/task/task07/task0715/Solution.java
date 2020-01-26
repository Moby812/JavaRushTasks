package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "мама");
        list.add(1, "мыла");
        list.add(2, "раму");

        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");

        for (String x : list) System.out.println(x);
    }
}

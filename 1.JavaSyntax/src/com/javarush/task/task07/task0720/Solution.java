package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела

Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine());    //Вводим N строк в список
        int M = Integer.parseInt(reader.readLine());    //переставляем M первых строк в конец

        ArrayList<String> nString = new ArrayList<String>();
        for (int i = 0; i < N; i++) nString.add(reader.readLine());

        for (int i = 0; i < M; i++) {
            nString.add(nString.get(0));
            nString.remove(0);
        }

    for (String x : nString) System.out.println(x);     //выводим список
    }
}

package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        List <String> words = new ArrayList<>(Arrays.asList(string.split(" ")));                                  //парсим строку по условию " ", и добавляем строки в создаваемый массив words

//        List <String> words = new ArrayList<>();
//        String word[] = string.split(" ");


        for (String x: words) System.out.println(x);

    }
}

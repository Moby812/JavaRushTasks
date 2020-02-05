package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
http://proglang.su/java/strings-trim

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
//        List <String> words = new ArrayList<>(Arrays.asList(string.split(" ")));                                      //парсим строку по условию " ", и добавляем строки в создаваемый лист words

//        List <String> words = new ArrayList<>();
//        String word[] = string.split(" ");

        String[] words = string.split(" ");                                                                       //парсим строку по условию " ", и добавляем строки в создаваемый массив words

        StringBuilder stringBuilder = new StringBuilder();
        for (String s:words) {
            char [] letter = s.toCharArray();                                                                                   //toCharArray() — преобразует данную строку в новый массив символов.
            letter[0] = Character.toUpperCase(letter[0]);                                                               //поднимаем в верхний егистр первый символ из массива letter
            stringBuilder.append(letter);
            stringBuilder.append(" ");

        }

        System.out.println(stringBuilder.toString().trim());                                                            //trim() — возвращает копию строки с пропущенными начальными и конечными пробелами,

//        for (String s:words) {                                                                                        //поднимаем первый символ строки без билдера
//            String capitalized = Character.toUpperCase(s.charAt(0)) + s.substring(1);                                 //toUpperCase() - преобразует все знаки в данной строке в верхний регистр
//            System.out.print(capitalized+ " ");                                                                       //charAt() — возвращает символ, расположенный по указанному индексу строки.
//        }                                                                                                             //substring() - возвращает строку, начиная с указанного символа.
    }
}

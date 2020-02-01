package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Самая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();                                                       //создаём лист
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 4, 4, 8, 8, 4, 12, 12, 14));      //быстрая инициализация переменных в лист

        for (int i = 0; i < 10; i++) numbers.add(Integer.parseInt(reader.readLine()));                //заполняем лист 10-ю значениями с клавиатуры

        List<Integer> countList = new ArrayList<>();                                                //альтернатива без 2х листов = https://javarush.ru/help/35825
        int count = 1;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) count += 1;
            else {
                countList.add(count);
                count = 1;
            }
        }
        Collections.sort(countList);
        System.out.println(countList.get(countList.size()-1));                                  //должен вывести "3"
    }
}
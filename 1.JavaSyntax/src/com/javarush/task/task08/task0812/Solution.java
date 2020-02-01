package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();                                      //создаём лист

//        for (int i = 0; i < 10; i++) numbers.add(Integer.parseInt(reader.readLine()));  //заполняем лист 10-ю значениями с клавиатуры
numbers.add(2);
numbers.add(2);
numbers.add(3);
numbers.add(3);
numbers.add(4);
numbers.add(4);
numbers.add(5);
numbers.add(5);
numbers.add(5);
numbers.add(2);

        int count = 0;                                              // TODO: 01.02.2020 исключить из счёта учитывание повторяющихся пар 
        for (int i = 0; i < numbers.size()-1; i++) {
            if(numbers.get(i).equals(numbers.get(i + 1))) count+=1;
        }
        System.out.println(count);                                  //должен вывести "3"
    }
}
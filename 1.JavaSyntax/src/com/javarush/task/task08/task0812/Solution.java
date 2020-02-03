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
        List<Integer> numbers = new ArrayList<>();                                                                      //создаём лист
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 4, 4, 8, 8, 8, 8, 8, 1, 1));                         //быстрая инициализация переменных в лист

        for (int i = 0; i < 10; i++) numbers.add(Integer.parseInt(reader.readLine()));                                  //заполняем лист 10-ю значениями с клавиатуры

        List<Integer> countList = new ArrayList<>();                                                                    //создаём лист в который будем переносить длины строк
        int count = 1;
        for (int i = 0; i < numbers.size() ; i++) {
            if (i == numbers.size()-1) {                                    //если символ последный в списке,
                countList.add(count);                                       //то добавляем счётчик в список длины
                break;                                                      //и выходим из цикла
            }
            if (numbers.get(i).equals(numbers.get(i + 1))) count++;         //если текущее значение в списке чисел = следующему, то увеличиваем счётчик
            else {
                countList.add(count);                                       //если не равно, то добавляем значение счётчика в список длины
                count = 1;                                                  //и обнуляем счэтчик
            }
        }

//        for (Integer x: countList) System.out.println(x);                                                             //выводим все длины повторяющихся последовательностей
        Collections.sort(countList);                                                                                    //сортируем список длин строк
        System.out.println(countList.get(countList.size()-1));                                                          //выводим последнее(максимальное) значение из списка длин строк

//        int count = 0;
//        int countMax = 1;
//        for (int i = 0; i < numbers.size() - 1; i++) {            /                                                   /альтернатива без использования 2х листов
//            if (numbers.get(i + 1).equals(numbers.get(i))) {
//                count++;
//                if (countMax < count) countMax = count;
//            } else {
//                count = 1;
//            }
//        }
//        System.out.println(countMax);
    }
}
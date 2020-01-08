package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   //инициализируем сканер
        String name = reader.readLine();                                                //задаем чтение с клавы
        int number2F = Integer.parseInt(reader.readLine());                             //читаем с клавы сразу int
        int number1F = Integer.parseInt(reader.readLine());
//        String number1 = reader.readLine();
//        String number2 = reader.readLine();
//        int number1F = Integer.parseInt(number1);                                       //преобразуем строку в число
//        int number2F = Integer.parseInt(number2);

        System.out.println(name+" получает "+number1F+" через "+number2F+" лет.");
    }
}

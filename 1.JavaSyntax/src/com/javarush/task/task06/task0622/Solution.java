package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int number4 = Integer.parseInt(reader.readLine());
        int number5 = Integer.parseInt(reader.readLine());

        ArrayList<Integer> numbers = new ArrayList<>(); //создали лист
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);

        for (int i = 0; i < numbers.size(); i++) {      //выводим поочереди весь список
            System.out.println(numbers.get(i));
        }
    }
}
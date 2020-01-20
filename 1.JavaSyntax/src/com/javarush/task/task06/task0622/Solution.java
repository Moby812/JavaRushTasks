package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Числа по возрастанию
Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код  http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int number4 = Integer.parseInt(reader.readLine());
        int number5 = Integer.parseInt(reader.readLine());

//        ArrayList<Integer> numbers = new ArrayList<>(); //создали лист ArrayList
//        numbers.add(number1);
//        numbers.add(number2);
//        numbers.add(number3);
//        numbers.add(number4);
//        numbers.add(number5);
//        Collections.sort(numbers);

//        for (int i = 0; i < numbers.size(); i++) {      //выводим поочереди весь список ArrayList
//            System.out.println(numbers.get(i));
//        }

////////////////////////////////////////////////////////////////
        int numbers[] = new int[]{number1, number2, number3, number4, number5};       //через обычный массив
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
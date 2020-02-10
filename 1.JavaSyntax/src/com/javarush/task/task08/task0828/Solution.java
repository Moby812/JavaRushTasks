package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".

1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
//        System.out.println("У тестирования всё хорошо, а вот у горла - плохо");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        Map<String, Integer> months = new HashMap<>();
        months.put("January",1);
        months.put("February",2);
        months.put("March",3);
        months.put("April",4);
        months.put("May",5);
        months.put("June",6);
        months.put("July",7);
        months.put("August",8);
        months.put("September",9);
        months.put("October",10);
        months.put("November",11);
        months.put("December",12);


        for (Map.Entry <String, Integer> pair: months.entrySet()) {
            if (pair.getKey().equalsIgnoreCase(month)) System.out.println(pair.getKey() +" is the "+ pair.getValue() +" month"); //equals(month)) System.out.println(month +" is the "+ pair.getValue() +".");
//            if (pair.getKey().equalsIgnoreCase(month)) System.out.print(month +" is the "+ pair.getValue() +" month"); //equals(month)) System.out.println(month +" is the "+ pair.getValue() +".");
        }
    }
}

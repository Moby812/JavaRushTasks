package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        String text = "количество дней в году: ";
        int leapYear = 366;         //висакосны год
        int standardYear = 365;     //не висакосный год

        if (year % 400 == 0 || (year % 400) % 100 != 0 && ((year % 400) % 100) % 4 == 0) {
            System.out.println(text + leapYear);
        } else {
            System.out.println(text + standardYear);
        }
    }
}
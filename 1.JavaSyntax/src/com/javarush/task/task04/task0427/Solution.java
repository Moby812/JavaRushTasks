package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(reader.readLine());

        String num = reader.readLine();
        int count = num.length();       //считаем количество знаков в строке
        int numF = Integer.parseInt(num);

        if (numF >0 && numF <1000) {
            if (numF % 2 == 0)
                System.out.print("четное");
            else
                System.out.print("нечетное");
        }

        if (numF >0 && numF <1000) {
            switch (count) {
                case 1: System.out.print(" однозначное число");
                    break;
                case 2: System.out.print(" двузначное число");
                    break;
                case 3: System.out.print(" трехзначное число");
                    break;
            }
        }
    }
}

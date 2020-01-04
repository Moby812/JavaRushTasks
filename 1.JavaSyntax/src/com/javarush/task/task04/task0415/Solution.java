package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        String win ="Треугольник существует.";
        String lose="Треугольник не существует.";

        if (a+b>c && a+c>b && c+b>a) {              //логический оператор "И" - &&
            System.out.println(win);
        } else {
            System.out.println(lose);
        }
    }
}
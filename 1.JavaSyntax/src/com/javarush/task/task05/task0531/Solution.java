package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

//        int minimum = min(e, min(min(a, b), min(c, d)));
//        int minimum = min(a, min(b, min(c, min(d, e))));             //вызов метода с 2мя входными параметрами
        System.out.println("Minimum = " + min(a,b,c,d,e));
    }


//    public static int min(int a, int b) {return a < b ? a : b;}   //метод с 2мя входными параметрами

    private static int min(int a, int b, int c, int d, int e) {                           //метод с 5-ю входными параметрами
        return Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
    }
}

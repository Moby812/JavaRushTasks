package com.javarush.task.task01.task0134;

/* 
Набираем воду в бассейн
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        //напишите тут ваш код
        int m3=a*b*c;
        int waterLiters = m3 *1000;     //в кубе 1к литров воды
        return waterLiters;
    }
}
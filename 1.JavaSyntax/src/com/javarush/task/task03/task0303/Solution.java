package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(10,1.12));   //к курсу $
        System.out.println(convertEurToUsd(10,70.59));  //к курсу руб
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код

        return eur*course;
    }
}

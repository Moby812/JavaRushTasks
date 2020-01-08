package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код
    public static int convertToSeconds(int hour){           //создали метод convertToSeconds который как параметр принимает интовое значение переданное в hour

        int sec = hour *60*60;
        return sec;                                         //метод convertToSeconds по итогу своей работы возвращает это значение
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(5));        //передаем параметр 5 в переменную hour, метода convertToSeconds
        System.out.println(convertToSeconds(10));       //

    }
}

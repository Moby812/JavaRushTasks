package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String text = "S";

        while (text.length()<10){
            text += "S";
        }

        int count = 10;
        while (count > 0) {
            System.out.println(text);
            count--;
        }
    }
}

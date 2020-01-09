package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int count = 10;
        int x = 1;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(8);
            }
            System.out.println();
            x++;
        }
    }
}

package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int factorOne = 1;      //count

        while (factorOne <= 10) {
            for (int factorTwo =1;factorTwo <= 10;factorTwo++){
                int factor = factorOne * factorTwo;
                System.out.print(factor + " ");
            }
            System.out.println("");
            factorOne++;
        }
    }
}

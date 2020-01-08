package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int factorOne = 1;

        while (factorOne <= 10) {
            int factorTwo=1;
            while (factorTwo <=10){
                int factor = factorOne * factorTwo;
                System.out.print(factor + " ");
                factorTwo++;
            }
            System.out.println("");
            factorOne++;
        }
    }
}

package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        if (abs(10 - a) > abs(10 - b)) {                //через метод abs() мы убираем знак "-" из получаемого в ввыражении числа, затем сравниваем a и b
            System.out.println(b);                            //если после вычитания a(2,3) БОЛЬШЕ b(1,4) то выводится b
        } else if (abs(10 - a) < abs(10 - b)) {
            System.out.println(a);
        } else {
            System.out.println(a);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
package com.javarush.task.task02.task0207;

/* 
Кусочек калькулятора
*/


public class Solution {

    public static class Calculator{
        static  int sum(int a, int b){
            return  a+b;
        }
        static int mult(int a, int b){
            return a*b;
        }
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 5;
        int b = 7;

        System.out.println(Calculator.sum(a,b));
        System.out.println(Calculator.mult(a,b));
    }
}
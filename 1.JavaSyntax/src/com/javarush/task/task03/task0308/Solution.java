package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x=1;
        for (int i = 1; i<=10; i++){
            x=x*i;
        }
        System.out.println(x);
//        System.out.println(1*2*3*4*5*6*7*8*9*10);
    }
}
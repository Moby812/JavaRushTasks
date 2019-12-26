package com.javarush.task.task02.task0211;

/* 
Самое нужное число 19
*/
public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + 3 * x;  //y = 3
     //   x = x * 2;      //x = 2
        x = x * 16;     //x = 16 or 32
     //   y = y + 2 * x;
        y = y + x;

        System.out.println(y);
    }
}

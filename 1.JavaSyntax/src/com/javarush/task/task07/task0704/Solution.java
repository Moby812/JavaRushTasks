package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] count = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < count.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            count[i] = num;
        }

        for (int i=count.length-1; i >= 0;i--){
            System.out.println(count[i]);
        }
    }
}


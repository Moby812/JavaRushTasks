package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        double numF = 0;
        for (int count = 0; true; count++) {
            int num = Integer.parseInt(reader.readLine());
            if (num != -1) {
                numF += num;
            } else {
                numF /= count;
                System.out.println(numF);
                break;
            }
        }
    }
}
package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int positiveNumber = 0;
        int negativeNumber = 0;

        if (num1 > 0)
            positiveNumber++;
        else if (num1 < 0)
            negativeNumber++;

        if (num2 > 0)
            positiveNumber++;
        else if (num2 < 0)
            negativeNumber++;

        if (num3 > 0)
            positiveNumber++;
        else if (num3 < 0)
            negativeNumber++;

        System.out.println("количество отрицательных чисел: " + negativeNumber);
        System.out.println("количество положительных чисел: " + positiveNumber);
        }
    }

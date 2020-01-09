package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int result;
//String number = reader.readLine();
//int numberF = Integer.parseInt(number);
        if (number == 0) {
            System.out.println(0);
        } else if (number > 0) {
            result = number * 2;
            System.out.println(result);
        } else {
            result = number + 1;
            System.out.println(result);
        }
    }

}
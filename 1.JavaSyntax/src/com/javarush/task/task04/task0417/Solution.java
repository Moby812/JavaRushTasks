package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        if (number1 == number2 || number1 == number3)
            System.out.print(number1+" ");
        if (number2 == number1 || number2 == number3)
            System.out.print(number2+" ");
        if (number3 == number1 || number3 == number2)
            System.out.print(number3);
    }
}
package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if (num1 == num2 && num2 !=num3) {
            System.out.println(3);
        } else if (num2 == num3 && num3 !=num1){
            System.out.println(1);
        } else if (num1 == num3 && num3 !=num2){
            System.out.println(2);
        } else if (num1 == num2 & num2 == num3){
            System.out.println("Все числа равны");
        } else {
        }
    }
}

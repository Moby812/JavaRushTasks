package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        positiveOrNegative(num);
        evenOrNotEven(num);
        if (num != 0) System.out.println("число");
        if (num == 0) System.out.println("ноль");
    }

    public static void positiveOrNegative(int num){
        if (num > 0)
            System.out.print("положительное ");
        else if (num < 0)
            System.out.print("отрицательное ");
    }

    public static void evenOrNotEven (int num){
        if (num != 0 && num%2 == 0)
            System.out.print("четное ");
        else if (num != 0 & num%2 != 0)
            System.out.print("нечетное ");
    }
}

package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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

        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2) || num1 == num2 || num1 == num3) {             // &&, || - любой из этих операторов оценивает правую сторону операции тогда, когда левая сторона операции является true (истинной);
            System.out.println(num1);
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1 || num2 == num3)) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}

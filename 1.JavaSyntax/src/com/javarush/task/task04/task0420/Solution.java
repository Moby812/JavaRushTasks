package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        String space = " ";

        if (a >= b && a >= c) {
            System.out.print(a + space);
            if (b >= c) {
                System.out.print(b + space);
                System.out.print(c);
            } else {
                System.out.print(c + space);
                System.out.print(b);
            }
        } else if (b >= a && b >= c) {
            System.out.print(b + space);
            if (a >= c) {
                System.out.print(a + space);
                System.out.print(c);
            } else {
                System.out.print(c + space);
                System.out.print(a);
            }
        } else {
            System.out.print(c + space);
            if (a >= b) {
                System.out.print(a + space);
                System.out.print(b);
            } else {
                System.out.print(b + space);
                System.out.print(a);
            }
        }
    }
}
package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String monday = "понедельник";
        String tuesday = "вторник";
        String wednesday = "среда";
        String thursday = "четверг";
        String friday = "пятница";
        String saturday = "суббота";
        String sunday = "воскресенье";
        String zero = "такого дня недели не существует";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberDay = Integer.parseInt(reader.readLine());
        if (numberDay == 1) {
            System.out.println(monday);
        } else if (numberDay == 2) {
            System.out.println(tuesday);
        } else if (numberDay == 3) {
            System.out.println(wednesday);
        } else if (numberDay == 4) {
            System.out.println(thursday);
        } else if (numberDay == 5) {
            System.out.println(friday);
        } else if (numberDay == 6) {
            System.out.println(saturday);
        } else if (numberDay == 7) {
            System.out.println(sunday);
        } else {
            System.out.println(zero);
        }
    }
}
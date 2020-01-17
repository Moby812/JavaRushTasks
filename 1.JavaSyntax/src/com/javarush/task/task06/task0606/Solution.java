package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;     //чётные
    public static int odd;      //нечётные

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int numCount = num.length();            //вычисляем количество символов в числе
        int number = Integer.parseInt(num);     //из строки в число

        for (;numCount>0;numCount--) {
            if (number %2 == 0) even++;
            else odd++;
//            if (number %2 == 0 && number !=0) even++; // TODO: 2020-01-17 учесть что "0" считает как чётное
//            else if (number % 2 == 1)odd++;
            number /=10;
        }

        System.out.println("чётные: "+even);
        System.out.println("нечётные: "+odd);
    }
}
